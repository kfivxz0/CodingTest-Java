// https://school.programmers.co.kr/learn/courses/30/lessons/12910

// 문제 설명
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

//풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] temp2;
    int[] temp = new int[arr.length];
    int k = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % divisor == 0) {
        temp[k] = arr[i];
        k++;
      }
    }

    if (k == 0) {
      temp2 = new int[1];
      temp2[0] = -1;
    } else {
      temp2 = Arrays.copyOfRange(temp, 0, k);
      Arrays.sort(temp2);
    }
    return temp2;
  }
}
