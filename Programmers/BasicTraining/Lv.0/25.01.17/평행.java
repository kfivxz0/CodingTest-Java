// https://school.programmers.co.kr/learn/courses/30/lessons/120875

// 문제 설명
// 점 네 개의 좌표를 담은 이차원 배열 dots가 다음과 같이 매개변수로 주어집니다.

// [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
// 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution
// 함수를 완성해보세요.

// 풀이
class Solution {
  public int solution(int[][] dots) {
    int x1 = dots[0][0], y1 = dots[0][1];
    int x2 = dots[1][0], y2 = dots[1][1];
    int x3 = dots[2][0], y3 = dots[2][1];
    int x4 = dots[3][0], y4 = dots[3][1];
    int answer = 0;

    double slope1 = (double) (y2 - y1) / (x2 - x1);
    double slope2 = (double) (y4 - y3) / (x4 - x3);
    if (slope1 == slope2)
      answer = 1;

    slope1 = (double) (y3 - y1) / (x3 - x1);
    slope2 = (double) (y2 - y4) / (x2 - x4);
    if (slope1 == slope2)
      answer = 1;

    slope1 = (double) (y4 - y1) / (x4 - x1);
    slope2 = (double) (y2 - y3) / (x2 - x3);
    if (slope1 == slope2)
      answer = 1;

    return answer;
  }
}