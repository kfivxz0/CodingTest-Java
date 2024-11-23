//https://school.programmers.co.kr/learn/courses/30/lessons/120899

// 문제 설명
// 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

// 풀이
class Solution {
  public int[] solution(int[] array) {
      int max = array[0];
      int idx = 0;
      for (int i = 0; i < array.length; i++) {
          if (array[i] > max) {
              max = array[i];
              idx = i;
          }
      }
      return new int[]{max, idx};
  }
}