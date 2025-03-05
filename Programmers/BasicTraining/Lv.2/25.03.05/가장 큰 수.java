// https://school.programmers.co.kr/learn/courses/30/lessons/42746

// 문제 설명
// 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
// 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중
// 가장 큰 수는 6210입니다.
// 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어
// return 하도록 solution 함수를 작성해주세요.

// 풀이

import java.util.Arrays;
import java.util.Comparator;

class Solution {

  public String solution(int[] numbers) {

    // 숫자를 문자열로 변환
    String[] result = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      result[i] = String.valueOf(numbers[i]);
    }

    // 정렬
    Arrays.sort(result, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {

        return ((o2 + o1).compareTo(o1 + o2));
      }
    });

    // 0만 여러개 있는 배열의 경우 하나의 0만 리턴
    if (result[0].equals("0")) {
      return "0";
    }

    String answer = "";
    // 정렬된 문자 하나로 합치기
    for (String a : result) {
      answer += a;
    }
    return answer;
  }
}