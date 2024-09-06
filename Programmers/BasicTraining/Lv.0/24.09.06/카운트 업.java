// https://school.programmers.co.kr/learn/courses/30/lessons/181920

// 문제 설명
// 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int[] solution(int start_num, int end_num) {
    int[] answer = new int[end_num - start_num + 1];
    int n = end_num - start_num;

    for (int i = 0; i <= n; i++) {
      answer[i] = start_num + i;
    }
    return answer;
  }
}