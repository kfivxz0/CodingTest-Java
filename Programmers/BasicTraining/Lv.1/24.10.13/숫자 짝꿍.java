// https://school.programmers.co.kr/learn/courses/30/lessons/131128

// 문제 설명
// 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

// 예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
// 두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

//풀이
import java.util.Arrays;

class Solution {
  public String solution(String X, String Y) {

    char[] charX = X.toCharArray();
    char[] charY = Y.toCharArray();
    Arrays.sort(charX);
    Arrays.sort(charY);

    StringBuilder answer = new StringBuilder();
    int idxX = charX.length - 1;
    int idxY = charY.length - 1;

    while (idxX >= 0 && idxY >= 0) {
      if (charX[idxX] == charY[idxY]) {
        answer.append(charX[idxX]);
        idxX--;
        idxY--;
      } else if (charX[idxX] > charY[idxY]) {
        idxX--;
      } else {
        idxY--;
      }
    }

    if (answer.length() == 0) {
      return "-1";
    }

    if (answer.toString().matches("0+")) {
      return "0";
    }

    return answer.toString();
  }
}