// https://school.programmers.co.kr/learn/courses/30/lessons/181907

// 문제 설명
// 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public String solution(String my_string, int n) {
      my_string = my_string.substring(0, n);
      return my_string;
  }
}