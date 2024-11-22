// https://school.programmers.co.kr/learn/courses/30/lessons/120893

// 문제 설명
// 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution
// 함수를 완성해주세요.

// 풀이
class Solution {
  public String solution(String my_string) {
    String answer = "";
    for (int i = 0; i < my_string.length(); i++) {
      if (Character.isUpperCase(my_string.charAt(i))) {
        answer += Character.toLowerCase(my_string.charAt(i));
      } else {
        answer += Character.toUpperCase(my_string.charAt(i));
      }
    }
    return answer;
  }
}