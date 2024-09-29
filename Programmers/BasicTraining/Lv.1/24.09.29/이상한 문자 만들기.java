// https://school.programmers.co.kr/learn/courses/30/lessons/12930

// 문제 설명
// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

//풀이
class Solution {
  public String solution(String s) {
    String answer = "";

    s = s.toLowerCase();

    String[] str = s.split("");

    int key = 0;

    for (int i = 0; i < str.length; i++) {
      if (key % 2 == 0) {
        str[i] = str[i].toUpperCase();
      }

      if (str[i].isBlank()) {
        key = -1;
      }
      answer += str[i];
      key++;
    }

    return answer;
  }
}