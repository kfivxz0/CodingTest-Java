// https://school.programmers.co.kr/learn/courses/30/lessons/120813

// 문제 설명
// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int[] solution(int n) {
    int[] answer = new int[(n + 1) / 2];
    for (int i = 1; i <= n; i += 2) {
      answer[i / 2] = i;
    }
    return answer;
  }
}