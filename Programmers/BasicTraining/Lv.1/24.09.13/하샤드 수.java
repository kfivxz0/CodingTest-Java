// https://school.programmers.co.kr/learn/courses/30/lessons/12947

// 문제 설명
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

//풀이
class Solution {
  public boolean solution(int x) {
    boolean answer = true;
    int sum = 0;

    String[] num = Integer.toString(x).split("");

    for (int i = 0; i < num.length; i++) {
      sum += Integer.parseInt(num[i]);
    }

    if (x % sum != 0)
      answer = false;

    return answer;
  }
}