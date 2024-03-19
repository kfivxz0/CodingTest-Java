// https://school.programmers.co.kr/learn/courses/30/lessons/181889

// 문제 설명
// 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution {
  public int[] solution(int[] num_list, int n) {
    return Arrays.copyOfRange(num_list, 0, n);
  }
}
