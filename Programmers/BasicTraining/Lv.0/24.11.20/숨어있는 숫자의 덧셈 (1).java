// https://school.programmers.co.kr/learn/courses/30/lessons/120851

// 문제 설명
// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를
// 완성해주세요.

// 풀이
import java.util.regex.Pattern;

class Solution {
  public int solution(String my_string) {
    int answer = 0;
    for (int i = 0; i < my_string.length(); i++) {
      if (Pattern.matches("^[0-9]*", my_string.substring(i, i + 1))) {
        answer += Integer.parseInt(my_string.substring(i, i + 1));
      }
    }
    return answer;
  }
}
