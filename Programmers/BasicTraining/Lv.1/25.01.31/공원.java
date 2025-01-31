// https://school.programmers.co.kr/learn/courses/30/lessons/340198

// 문제 설명
// 지민이는 다양한 크기의 정사각형 모양 돗자리를 가지고 공원에 소풍을 나왔습니다. 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아
// 지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 합니다. 예를 들어 지민이가 가지고 있는 돗자리의 한 변 길이가 5, 3, 2
// 세 종류이고, 사람들이 다음과 같이 앉아 있다면 지민이가 깔 수 있는 가장 큰 돗자리는 3x3 크기입니다.
// 지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park가
// 주어질 때 지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이를 return 하도록 solution 함수를 완성해 주세요. 아무런 돗자리도
// 깔 수 없는 경우 -1을 return합니다.

// 풀이
import java.util.*;

class Solution {
  public int solution(int[] mats, String[][] park) {
    List<Integer> matList = new ArrayList<>();
    // mats 를 리스트화 시킨후 오름차순 정렬
    Arrays.stream(mats).forEach(matList::add);
    Collections.sort(matList);

    int answer = -1;

    // 공원 첫번째 칸부터 순차적으로 확인
    for (int i = 0; i < park.length; i++) {
      if (matList.isEmpty())
        break;

      for (int j = 0; j < park[i].length; j++) {
        if (matList.isEmpty())
          break;

        // 배열의 값이 -1 일 경우 실행
        if (park[i][j].equals("-1")) {

          while (!matList.isEmpty()) {
            // 오름차순 된 리스트의 첫번째 항목 get
            Integer mat = matList.get(0);

            boolean flag = true;
            // park[i][j]부터 매트의 길이만큼 조회
            for (int y = i; y < Math.min(i + mat, park.length); y++) {
              for (int x = j; x < Math.min(j + mat, park[y].length); x++) {
                // 만약 매트 길이가 공원 밖으로 나간다면 flag = false 처리 후 반복문 종료
                if (park.length - i < mat || park[i].length - j < mat || !park[y][x].equals("-1")) {
                  flag = false;
                  break;
                }
              }
              if (!flag)
                break;
            }

            if (!flag) {
              break;
            } else {
              // 매트의 길이에 만족한다면 answer 값을
              // 조회한 매트한 길이로 변경
              // 그 후 다른 칸에서는 해당 매트의 길이로 조회할 필요가 없기 때문에 remove 처리
              answer = matList.get(0);
              matList.remove(0);
            }
          }

        }
      }
    }

    return answer;
  }
}