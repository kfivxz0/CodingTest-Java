// https://school.programmers.co.kr/learn/courses/30/lessons/181943

// 문제 설명
// 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public String solution(String my_string, String overwrite_string, int s) {
    String answer = "";
    String sub1 = my_string.substring(0, s);
    String sub2 = overwrite_string;
    String sub3 = my_string.substring((s + overwrite_string.length()), my_string.length());
    answer = sub1 + sub2 + sub3;

    return answer;
  }
}