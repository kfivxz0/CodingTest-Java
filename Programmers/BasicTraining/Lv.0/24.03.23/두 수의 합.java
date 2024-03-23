// https://school.programmers.co.kr/learn/courses/30/lessons/181846

// 문제 설명
// 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

// 풀이
import java.math.BigInteger;

class Solution {
  public String solution(String a, String b) {
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);

    BigInteger sum = numA.add(numB);

    return sum.toString();
  }
}