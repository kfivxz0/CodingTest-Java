// https://school.programmers.co.kr/learn/courses/30/lessons/181945

// 문제 설명
// 문자열 str이 주어집니다.
// 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

// 풀이
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String[] str = a.split("");

    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
  }
}