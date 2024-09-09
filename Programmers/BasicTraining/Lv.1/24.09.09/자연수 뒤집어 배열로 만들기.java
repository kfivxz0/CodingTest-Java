// https://school.programmers.co.kr/learn/courses/30/lessons/12932

// 문제 설명
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

//풀이
import java.util.Arrays;

class Solution {
  public int[] solution(long n) {

    String s = String.valueOf(n);

    int[] answer = new int[s.length()];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = Integer.parseInt(s.substring(answer.length - 1 - i, answer.length - i));
    }

    return answer;
  }
}