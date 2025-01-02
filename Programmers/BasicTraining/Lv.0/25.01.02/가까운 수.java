// https://school.programmers.co.kr/learn/courses/30/lessons/120890

// 문제 설명
// 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int solution(int[] array, int n) {
    int answer = 0;
    Arrays.sort(array);
    for (int i = 0; i < array.length; i++) {
      if (i == 0 || Math.abs(array[i] - n) < Math.abs(answer - n)) {
        answer = array[i];
        if (answer == n) {
          break;
        }
      }
    }
    return answer;
  }
}