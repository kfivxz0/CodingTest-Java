// https://school.programmers.co.kr/learn/courses/30/lessons/181949

// 문제 설명
// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

// 풀이
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String answer = "";

    for (int i = 0; i < a.length(); i++) {
      char b = a.charAt(i);
      if (Character.isLowerCase(b)) {
        answer += Character.toUpperCase(b);
      } else {
        answer += Character.toLowerCase(b);
      }
    }
    System.out.println(answer);
  }
}