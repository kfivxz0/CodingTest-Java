// https://school.programmers.co.kr/learn/courses/30/lessons/120888

// 문제 설명
// 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을
// return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public String solution(String my_string) {
    String[] arr = my_string.split("");
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j].equals(arr[i])) {
          arr[j] = "";
        }
      }
    }
    return String.join("", arr);
  }
}