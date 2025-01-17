// https://school.programmers.co.kr/learn/courses/30/lessons/120866

// 문제 설명
// 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
// 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
// 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를
// 완성해주세요.

// 풀이
import java.util.*;

class Solution {
  public int solution(int[][] board) {
    ArrayList<int[]> list = new ArrayList<>();
    int answer = 0;
    int[] dx = { 0, 1, -1, 0, -1, 1, 1, -1 };
    int[] dy = { 1, 0, 0, -1, -1, 1, -1, 1 };

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 1) {
          int[] temp = { i, j };
          list.add(temp);
        }
      }
    }

    for (int a = 0; a < list.size(); a++) {
      int i = list.get(a)[0];
      int j = list.get(a)[1];
      for (int k = 0; k < 8; k++) {
        if (dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.length - 1 && dy[k] + j <= board.length - 1)
          board[dx[k] + i][dy[k] + j] = 1;
      }
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 0)
          answer += 1;
      }
    }
    return answer;
  }
}