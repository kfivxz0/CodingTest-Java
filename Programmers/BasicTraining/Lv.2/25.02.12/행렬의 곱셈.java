// https://school.programmers.co.kr/learn/courses/30/lessons/12949

// 문제 설명
// 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

// 풀이
class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    // 결과를 저장할 행렬
    int[][] answer = new int[arr1.length][arr2[0].length];

    // arr1의 행 수만큼 반복
    for (int i = 0; i < arr1.length; i++) {
      // arr2의 열 수만큼 반복
      for (int j = 0; j < arr2[0].length; j++) {
        // 행렬의 곱셈
        for (int k = 0; k < arr1[0].length; k++) {
          answer[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    return answer;
  }
}