// https://school.programmers.co.kr/learn/courses/30/lessons/181899

// 문제 설명
// 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int start, int end_num) {
    int[] answer = new int[start - end_num + 1];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = start--;
    }

    return answer;
  }
}