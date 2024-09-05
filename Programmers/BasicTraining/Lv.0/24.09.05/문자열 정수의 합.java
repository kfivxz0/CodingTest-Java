// https://school.programmers.co.kr/learn/courses/30/lessons/181849

// 문제 설명
// 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(String num_str) {
    int answer = 0;
    for (int i = 0; i < num_str.length(); i++) {
      int rs = Integer.parseInt(num_str.substring(i, i + 1));
      answer += rs;
    }
    return answer;
  }
}