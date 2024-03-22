https://school.programmers.co.kr/learn/courses/30/lessons/181878

// 문제 설명
// 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
// 단, 알파벳 대문자와 소문자는 구분하지 않습니다.

// 풀이
class Solution {
  public int solution(String myString, String pat) {
      int answer = 0;
      myString = myString.toUpperCase();
      pat = pat.toUpperCase();
      
      if(myString.contains(pat)){
          answer = 1;
      } else{
          answer = 0;
      }
      return answer;
  }
}