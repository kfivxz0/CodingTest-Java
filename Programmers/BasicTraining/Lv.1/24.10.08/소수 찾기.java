// https://school.programmers.co.kr/learn/courses/30/lessons/12921

// 문제 설명
// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
// 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
// (1은 소수가 아닙니다.)

//풀이
class Solution {
  public int solution(int n) {
    int answer = 0;

    for (int i = 2; i <= n; i++) {
      boolean chk = true;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          chk = false;
          break;
        }
      }
      if (chk) {
        answer++;
      }
    }

    return answer;

  }
}
