// https://school.programmers.co.kr/learn/courses/30/lessons/181923

// 문제 설명
// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
// 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
// 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
// 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

// 풀이
import java.util.*;

class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];
    Arrays.fill(answer, Integer.MAX_VALUE);

    for (int j = 0; j < queries.length; j++) {
      for (int i = queries[j][0]; i <= queries[j][1]; i++) {
        if (arr[i] > queries[j][2]) {
          answer[j] = Math.min(answer[j], arr[i]);
        }
      }
      if (answer[j] == Integer.MAX_VALUE)
        answer[j] = -1;
    }
    return answer;
  }
}