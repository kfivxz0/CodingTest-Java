// https://school.programmers.co.kr/learn/courses/30/lessons/12951

// 문제 설명
// JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
// 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

// 풀이
import java.util.*;

class Solution {
  public String solution(String s) {
    String answer = "";
    String[] arr = s.split(" ");

    for (int i = 0; i < arr.length; i++) {
      String now = arr[i];

      if (arr[i].length() == 0) {
        answer += " "; // 문자가 없을 경우 공백
      }
      // 문자가 있다면
      else {

        answer += now.substring(0, 1).toUpperCase();
        answer += now.substring(1, now.length()).toLowerCase();
        answer += " ";
      }

    }

    if (s.substring(s.length() - 1, s.length()).equals(" ")) {
      return answer;
    }

    // 맨 마지막 " " 제거 후 반환
    return answer.substring(0, answer.length() - 1);
  }

}
