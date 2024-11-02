// https://school.programmers.co.kr/learn/courses/30/lessons/181916

// 문제 설명
// 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

// 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
// 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
// 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
// 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을
// 얻습니다.
// 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
// 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를
// 작성해 주세요.

// 풀이
import java.util.*;

class Solution {
  public int solution(int a, int b, int c, int d) {
    int answer = 0;

    int[] dice = { a, b, c, d };
    Arrays.sort(dice);

    if (dice[0] == dice[3]) {
      answer = 1111 * dice[3];
    } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
      answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);

      System.out.println(dice[1] + " " + dice[0] + " " + dice[3] + " ");
    } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
      answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
    } else if (dice[0] == dice[1]) {
      answer = dice[2] * dice[3];
    } else if (dice[1] == dice[2]) {
      answer = dice[0] * dice[3];
    } else if (dice[2] == dice[3]) {
      answer = dice[0] * dice[1];
    } else {
      answer = dice[0];
    }

    return answer;
  }
}
