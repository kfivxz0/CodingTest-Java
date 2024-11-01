// https://school.programmers.co.kr/learn/courses/30/lessons/120822

// 문제 설명
// 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public String solution(String my_string) {
    String answer = "";

    char[] str = my_string.toCharArray();
    char[] reverse = new char[str.length];

    for (int i = 0; i < str.length; i++) {
      reverse[i] = str[str.length - i - 1];
    }

    answer = new String(reverse);
    return answer;
  }
}