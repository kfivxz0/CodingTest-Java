// https://school.programmers.co.kr/learn/courses/30/lessons/42889

// 문제 설명
// 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다.
// 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.
// 이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게
// 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.
// 실패율은 다음과 같이 정의한다.
// 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
// 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
// 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.

// 풀이
public class Solution {
  public int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    double[] failArr = new double[N];
    for (int i = 0; i < N; i++) { // 스테이지 수 N만큼 반복
      double clearCnt = 0; // 스테이지 도달한 플레이어 수 - 분모
      double ingCnt = 0; // 스테이지 중인 플레이어 수 - 분자
      for (int j = 0; j < stages.length; j++) {
        if (i + 1 == stages[j]) { // i+1번째 스테이지 깻는지 체크하여 분모/분자 증가
          ingCnt++;
          clearCnt++;
        } else if (i + 1 < stages[j]) {
          clearCnt++;
        }
      }
      if (clearCnt != 0) { // 분모가 0일때는 연산하지 않고 0값 넣기
        failArr[i] = ingCnt / clearCnt;
        answer[i] = i + 1;
      } else {
        failArr[i] = 0;
        answer[i] = i + 1;
      }
    }

    double tmp = 0; // 실패율 배열 값을 담을 변수
    int stgTmp = 0; // 해당 스테이지 값을 담을 변수

    for (int i = 0; i < failArr.length; i++) {
      for (int j = i + 1; j < failArr.length; j++) {
        if (failArr[i] > failArr[j]) {
          continue;
        } else if (failArr[i] == failArr[j]) {
          if (answer[i] < answer[j]) {
            continue;
          } else {
            stgTmp = answer[i];
            answer[i] = answer[j];
            answer[j] = stgTmp;
          }
        } else {
          tmp = failArr[i];
          failArr[i] = failArr[j];
          failArr[j] = tmp;
          stgTmp = answer[i];
          answer[i] = answer[j];
          answer[j] = stgTmp;
        }
      }
    }
    return answer;
  }
}