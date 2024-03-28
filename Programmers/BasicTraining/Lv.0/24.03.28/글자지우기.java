// https://school.programmers.co.kr/learn/courses/30/lessons/181900

// 문제 설명
// 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를
// 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public String solution(String my_string, int[] indices) {
    String answer = "";
    String[] tmp = my_string.split("");
    for (int i = 0; i < indices.length; i++) {
      tmp[indices[i]] = "";
    }
    for (String x : tmp) {
      answer += x;
    }
    return answer;
  }
}