// https://school.programmers.co.kr/learn/courses/30/lessons/120817

// 문제 설명
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

//풀이
class Solution {
  public double solution(int[] numbers) {
    double answer = 0;
    double sum = 0;
    int len = numbers.length;
    for (int i = 0; i < len; i++) {
      sum += numbers[i];
    }
    answer = sum / len;
    return answer;
  }
}