// https://school.programmers.co.kr/learn/courses/30/lessons/181951

// 문제 설명
// 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

// 풀이
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("a = %s\nb = %s", a, b);
  }
}