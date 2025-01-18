// https://school.programmers.co.kr/learn/courses/30/lessons/120876

// 문제 설명
// 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
// 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.

// 풀이
class Solution {
  public int solution(int[][] lines) {
    // 1. arr 배열 및 변수 초기화
    int[] arr = new int[200];
    int answer = 0;

    // 2. lines 정보를 arr 배열에 적용
    for (int i = 0; i < lines.length; i++)
      for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
        arr[j]++;

    // 3. arr 배열에서 겹친 부분 세기
    for (int i = 0; i < 200; i++)
      if (arr[i] > 1)
        answer++;

    return answer;
  }
}
