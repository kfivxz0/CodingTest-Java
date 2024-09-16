// https://school.programmers.co.kr/learn/courses/30/lessons/12903

// 문제 설명
// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

//풀이
class Solution {
  public String solution(String s) {
    String answer = "";
    int len = s.length();
    for (int i = 0; i < len; i++) {
      if (len % 2 == 0) {
        answer += s.charAt(len / 2 - 1);
        answer += s.charAt(len / 2);
        break;
      } else {
        answer += s.charAt(len / 2);
        break;
      }
    }
    return answer;
  }
}
