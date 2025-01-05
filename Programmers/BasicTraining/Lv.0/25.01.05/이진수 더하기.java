// https://school.programmers.co.kr/learn/courses/30/lessons/120885

// 문제 설명
// 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public String solution(String bin1, String bin2) {
    String answer = "";
    answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    return answer;
  }
}