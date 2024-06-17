// https://school.programmers.co.kr/learn/courses/30/lessons/181836

// 문제 설명
// 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public String[] solution(String[] picture, int k) {
    int rows = picture.length;
    int cols = picture[0].length();

    int newRows = rows * k;
    int newCols = cols * k;

    String[] newPicture = new String[newRows];

    for (int i = 0; i < newRows; i++) {
      StringBuilder sb = new StringBuilder();
      int row = i / k;

      for (int j = 0; j < newCols; j++) {
        int col = j / k;
        char pixel = picture[row].charAt(col);
        sb.append(pixel);
      }

      newPicture[i] = sb.toString();
    }

    return newPicture;
  }
}