// https://school.programmers.co.kr/learn/courses/30/lessons/120897

// 문제 설명
// 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int n) {
    int[] answer = new int[n];
    int index = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        answer[index++] = i;
      }
    }
    return Arrays.copyOf(answer, index);
  }
}