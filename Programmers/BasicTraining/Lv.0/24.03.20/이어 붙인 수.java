// https://school.programmers.co.kr/learn/courses/30/lessons/181928

// 문제 설명
// 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(int[] num_list) {
    int answer = 0; // 정답 변수 초기화
    String sEven = ""; // 짝수를 저장할 문자열
    String sOdd = ""; // 홀수를 저장할 문자열
    int Even = 0; // 짝수 합을 저장할 변수
    int Odd = 0; // 홀수 합을 저장할 변수

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        sEven += num_list[i]; // 짝수일 경우 문자열에 추가
      } else {
        sOdd += num_list[i]; // 홀수일 경우 문자열에 추가
      }
    }
    Even = Integer.parseInt(sEven);
    Odd = Integer.parseInt(sOdd);
    answer = Even + Odd;
    return answer; // 정답 반환
  }
}