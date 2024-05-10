// https://school.programmers.co.kr/learn/courses/30/lessons/181872

// 문제 설명
// 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return
// 하는 solution 함수를 완성해 주세요.

// 풀이
class Solution {
  public String solution(String myString, String pat) {
    String answer = "";
    int patLength = pat.length();
    int myStringLength = myString.length();

    for (int i = myStringLength - 1; i >= 0; i--) {
      String substr = myString.substring(0, i + 1);
      if (substr.endsWith(pat)) {
        answer = substr;
        break;
      }
    }

    return answer;
  }
}