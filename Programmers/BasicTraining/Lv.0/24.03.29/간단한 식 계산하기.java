// https://school.programmers.co.kr/learn/courses/30/lessons/181865

// 문제 설명
// 문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는
// '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public int solution(String binomial) {
    String[] binomialList = binomial.split(" ");
    int answer = 0;
    if (binomialList[1].equals("+")) {
      answer = Integer.parseInt(binomialList[0]) + Integer.parseInt(binomialList[2]);
    } else if (binomialList[1].equals("-")) {
      answer = Integer.parseInt(binomialList[0]) - Integer.parseInt(binomialList[2]);
    } else if (binomialList[1].equals("*")) {
      answer = Integer.parseInt(binomialList[0]) * Integer.parseInt(binomialList[2]);
    }
    return answer;
  }
}