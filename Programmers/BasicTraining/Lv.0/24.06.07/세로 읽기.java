// https://school.programmers.co.kr/learn/courses/30/lessons/181904

// 문제 설명
// 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public String solution(String my_string, int m, int c) {
    String answer = "";
    for (int i = 0; i < my_string.length(); i++) {
      if ((i + 1) % m == c || m == 1 || ((i + 1) % m == 0 && c == m)) {
        answer += my_string.charAt(i);
      }
    }
    return answer;
  }
}
