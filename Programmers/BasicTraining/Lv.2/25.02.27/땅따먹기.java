// https://school.programmers.co.kr/learn/courses/30/lessons/12913

// 문제 설명
// 땅따먹기 게임을 하려고 합니다. 땅따먹기 게임의 땅(land)은 총 N행 4열로 이루어져 있고, 모든 칸에는 점수가 쓰여 있습니다.
// 1행부터 땅을 밟으며 한 행씩 내려올 때, 각 행의 4칸 중 한 칸만 밟으면서 내려와야 합니다. 단, 땅따먹기 게임에는 한 행씩 내려올
// 때, 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.
// 예를 들면,
// | 1 | 2 | 3 | 5 |

// | 5 | 6 | 7 | 8 |

// | 4 | 3 | 2 | 1 |

// 로 땅이 주어졌다면, 1행에서 네번째 칸 (5)를 밟았으면, 2행의 네번째 칸 (8)은 밟을 수 없습니다.
// 마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값을 return하는 solution 함수를 완성해 주세요. 위 예의 경우,
// 1행의 네번째 칸 (5), 2행의 세번째 칸 (7), 3행의 첫번째 칸 (4) 땅을 밟아 16점이 최고점이 되므로 16을 return 하면
// 됩니다.

// 풀이
class Solution {
  int solution(int[][] land) {
    // DP 방식으로 진행
    // 이전 행에 다른 열들 중 가장 큰 값을 더해줌
    for (int i = 1; i < land.length; i++) {
      land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
      land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
      land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
      land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
    }

    int answer = 0;
    // 마지막 행의 최댓값을 구해서 answer에 저장
    for (int i = 0; i < 4; i++) {
      answer = Math.max(answer, land[land.length - 1][i]);
    }

    return answer;
  }
}