// https://school.programmers.co.kr/learn/courses/30/lessons/120862

// 문제 설명
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
// solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(int[] numbers) {
    int answer = -100000000;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = numbers.length - 1; j > i; j--) {
        if (answer < numbers[i] * numbers[j]) {
          answer = numbers[i] * numbers[j];
        }
      }
    }
    return answer;
  }
}