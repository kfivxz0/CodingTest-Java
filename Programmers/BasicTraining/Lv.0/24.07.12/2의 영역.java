// https://school.programmers.co.kr/learn/courses/30/lessons/181894

// 문제 설명
// 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

// 단, arr에 2가 없는 경우 [-1]을 return 합니다.

// 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr) {
    int min = 100000, max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        min = Math.min(min, i);
        max = Math.max(max, i);
      }
    }

    if (min <= max) {
      return Arrays.copyOfRange(arr, min, max + 1);
    } else {
      return new int[] { -1 };
    }
  }
}