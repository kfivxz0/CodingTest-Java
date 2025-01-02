// https://school.programmers.co.kr/learn/courses/30/lessons/120896

// 문제 설명
// 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

//풀이
import java.util.Arrays;

class Solution {
  public String solution(String s) {
    String answer = "";

    // 중복제거
    String[] arr = Arrays.stream(s.split(""))
        .distinct()
        .sorted()
        .toArray(String[]::new);

    // 중복횟수 확인
    for (int i = 0; i < arr.length; i++) {
      String a = arr[i];
      int duplication = (int) Arrays.stream(s.split(""))
          .filter(x -> x.equals(a))
          .count();

      if (duplication == 1) {
        answer += a;
      }
    }
    return answer;
  }
}