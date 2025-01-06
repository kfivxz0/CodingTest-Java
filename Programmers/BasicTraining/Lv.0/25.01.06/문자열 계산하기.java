// https://school.programmers.co.kr/learn/courses/30/lessons/120902

// 문제 설명
// my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(String my_string) {
    String[] arr = my_string.split(" ");
    int answer = Integer.valueOf(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].equals("+")) {
        answer += Integer.valueOf(arr[i + 1]);
      } else if (arr[i].equals("-")) {
        answer -= Integer.valueOf(arr[i + 1]);
      } else {
        continue;
      }
    }
    return answer;
  }
}