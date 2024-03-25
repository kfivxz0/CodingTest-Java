// https://school.programmers.co.kr/learn/courses/30/lessons/181864

// 문제 설명
// 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼
// 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.

class Solution {
  public int solution(String myString, String pat) {
    char[] ch = myString.toCharArray();

    for (int i = 0; i < ch.length; i++) {
      if (ch[i] == 'A') {
        ch[i] = 'B';
      } else {
        ch[i] = 'A';
      }
    }
    String answer = new String(ch);

    if (answer.contains(pat)) {
      return 1;
    } else {
      return 0;
    }

  }
}