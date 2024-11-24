// https://school.programmers.co.kr/learn/courses/30/lessons/120911

// 문제 설명
// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한
// 문자열을 return 하도록 solution 함수를 완성해보세요.

// 풀이
import java.util.*;

class Solution {
  public String solution(String my_string) {
    String answer = "";
    String[] arry = my_string.toLowerCase().split("");

    Arrays.sort(arry);

    for (int i = 0; i < arry.length; i++) {
      answer += arry[i];
    }
    return answer;
  }
}