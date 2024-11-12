// https://school.programmers.co.kr/learn/courses/30/lessons/120909

// 문제 설명
// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를
// return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(int n) {
    if (n % Math.sqrt(n) == 0) {
      return 1;
    } else {
      return 2;
    }
  }
}