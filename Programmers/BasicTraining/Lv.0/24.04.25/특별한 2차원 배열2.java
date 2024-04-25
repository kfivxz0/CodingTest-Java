// https://school.programmers.co.kr/learn/courses/30/lessons/181831

// 문제 설명
// n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때, arr이 다음을 만족하면 1을 아니라면 0을 return 하는
// solution 함수를 작성해 주세요.
// 0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]

// 풀이
class Solution {
  public int solution(int[][] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] != arr[j][i]) {
          return 0;
        }
      }
    }

    return 1;
  }
}