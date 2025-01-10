// https://school.programmers.co.kr/learn/courses/30/lessons/120860

// 문제 설명
// 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

// 풀이
class Solution {
  public int solution(int[][] dots) {
    int answer = 0;
    int minX = dots[0][0];
    int minY = dots[0][1];
    int maxX = dots[0][0];
    int maxY = dots[0][1];

    for (int i = 1; i < dots.length; i++) {
      minX = Math.min(minX, dots[i][0]);
      minY = Math.min(minY, dots[i][1]);
      maxX = Math.max(maxX, dots[i][0]);
      maxY = Math.max(maxY, dots[i][1]);
    }

    answer = (maxX - minX) * (maxY - minY);
    return answer;
  }
}