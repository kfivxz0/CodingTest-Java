// https://school.programmers.co.kr/learn/courses/30/lessons/181832

// 문제 설명
// 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

//풀이
class Solution {
  public int[][] solution(int n) {
    int[][] ans = new int[n][n];
    int idx = 1;
    int rStart = 0, cStart = 0;
    int rEnd = n - 1, cEnd = n - 1;

    while (idx <= n * n) {
      // 우
      for (int i = cStart; i <= cEnd; i++)
        ans[rStart][i] = idx++;
      rStart++;
      // 아래
      for (int i = rStart; i <= rEnd; i++)
        ans[i][cEnd] = idx++;
      cEnd--;
      // 좌
      for (int i = cEnd; i >= cStart; i--)
        ans[rEnd][i] = idx++;
      rEnd--;
      // 위
      for (int i = rEnd; i >= rStart; i--)
        ans[i][cStart] = idx++;
      cStart++;

    }

    return ans;
  }
}