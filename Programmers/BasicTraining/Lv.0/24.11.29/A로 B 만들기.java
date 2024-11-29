// https://school.programmers.co.kr/learn/courses/30/lessons/120886

// 문제 설명
// 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면
// 0을 return 하도록 solution 함수를 완성해보세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int solution(String before, String after) {
    int answer = 0;

    char[] arr = before.toCharArray();
    char[] arr2 = after.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr2);

    String strArr = new String(arr);
    String strArr2 = new String(arr2);

    if (strArr.equals(strArr2)) {
      answer = 1;
    } else {
      answer = 0;
    }

    return answer;
  }
}