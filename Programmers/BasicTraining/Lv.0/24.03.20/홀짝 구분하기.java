// https://school.programmers.co.kr/learn/courses/30/lessons/181944

// 문제 설명
// 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해
// 보세요.

// 풀이
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println(n + " is even");
    } else {
      System.out.printf(n + " is odd");
    }
  }
}