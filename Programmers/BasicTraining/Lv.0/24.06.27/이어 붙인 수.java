// https://school.programmers.co.kr/learn/courses/30/lessons/181928

// 문제 설명
// 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(int[] num_list) {
    int answer = 0;
    String sEven = "";
    String sOdd = "";
    int Even = 0;
    int Odd = 0;

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        sEven += num_list[i];
        System.out.println(sEven);
      } else {
        sOdd += num_list[i];
        System.out.println(sOdd);
      }
    }
    Even = Integer.parseInt(sEven);
    Odd = Integer.parseInt(sOdd);
    answer = Even + Odd;
    return answer;
  }
}