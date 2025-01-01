// https://school.programmers.co.kr/learn/courses/30/lessons/120864

// 문제 설명
// 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(String my_string) {
    int answer = 0;

    String[] arr = my_string.split("[a-zA-Z]+");
    for (String string : arr) {
      try {
        answer += Integer.parseInt(string);
      } catch (Exception e) {
        continue;
      }
    }
    return answer;
  }
}