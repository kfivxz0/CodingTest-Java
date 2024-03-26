// https://school.programmers.co.kr/learn/courses/30/lessons/181867

// 문제 설명
// 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

// 풀이
class Solution {
  public int[] solution(String myString) {
    String[] answer = myString.split("x", -1);
    int[] rs = new int[answer.length];

    for (int i = 0; i < rs.length; i++) {
      rs[i] = answer[i].length();
    }
    return rs;
  }
}
