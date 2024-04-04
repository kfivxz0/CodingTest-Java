// https://school.programmers.co.kr/learn/courses/30/lessons/181834

// 문제 설명
// 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.

// 풀이
class Solution {
  public String solution(String myString) {
    StringBuilder answer = new StringBuilder();

    for (char c : myString.toCharArray())
      if (c < 'l')
        answer.append('l');
      else
        answer.append(c);

    return answer.toString();
  }
}