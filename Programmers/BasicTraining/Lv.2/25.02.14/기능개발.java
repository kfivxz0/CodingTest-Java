// https://school.programmers.co.kr/learn/courses/30/lessons/42586

// 문제 설명
// 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
// 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에
// 있는 기능이 배포될 때 함께 배포됩니다.
// 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가
// 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

// 풀이
import java.util.*;

class Solution {
  public ArrayList solution(int[] progresses, int[] speeds) {

    // 결과를 반환할 int형을 담는 ArrayList answer 선언
    // progresses의 각 인덱스 값이 100을 넘는 최소일수를 담을 Queue queue선언
    ArrayList<Integer> answer = new ArrayList<Integer>();
    Queue<Integer> queue = new LinkedList<Integer>();

    for (int i = 0; i < progresses.length; i++) {
      // progresses의 길이만큼 for문을 돌면서 ,
      // progresses 각 인덱스 값이 100을 넘기 위한 최소일수 계산 후 queue에 add 메소드로 넣기
      queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
    }

    // queue가 텅 빌 때까지(queue가 비어있지 않는 동안) while문을 돌면서
    while (!queue.isEmpty()) {
      // queue에서 꺼낸 값을 int형 변수 minDays에 저장
      int minDays = queue.poll();
      // 해당 일자에 배포되는 총 기능의 수를 담기 위한 변수, int count를 1로 선언 및 초기화
      int count = 1;

      // queue가 비어있지 않고,
      // queue.peek()의 값이 그 전에 poll()을 통해 얻은 값, 즉 minDays 보다 작은 동안

      while (!queue.isEmpty() && queue.peek() <= minDays) {
        queue.poll();
        count++;
      }
      // count의 값을 answer배열에 추가
      answer.add(count);
    }

    return answer;
  }
}