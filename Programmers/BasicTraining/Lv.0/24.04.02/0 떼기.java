// https://school.programmers.co.kr/learn/courses/30/lessons/181847

// 문제 설명
// 정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

// 풀이
public class Solution {
  public String solution(String n_str) {
    StringBuilder sb = new StringBuilder(n_str);
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == '0') {
        sb.setCharAt(i, ' '); // 해당 인덱스의 문자를 공백으로 대체
      } else {
        break; // 0이 아닌 문자를 만나면 반복문을 종료
      }
    }
    return sb.toString().trim(); // 문자열 양 끝의 공백을 제거한 후 반환
  }
}
