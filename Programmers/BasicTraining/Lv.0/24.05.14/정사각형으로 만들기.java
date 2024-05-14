// https://school.programmers.co.kr/learn/courses/30/lessons/181830

// 문제 설명
// 이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
import java.util.*;

class Solution {
  public int[][] solution(int[][] arr) {
    int oneLen = arr.length;
    int twoLen = arr[0].length;
    int[][] answer1 = new int[oneLen][oneLen];
    int[][] answer2 = new int[twoLen][twoLen];
    if (oneLen > twoLen) {
      for (int i = 0; i < oneLen; i++) {
        answer1[i] = Arrays.copyOf(arr[i], oneLen);
      }
      return answer1;
    } else if (twoLen > oneLen) {
      for (int i = 0; i < oneLen; i++) {
        answer2[i] = Arrays.copyOf(arr[i], twoLen);
      }
      return answer2;
    }
    return arr;
  }
}