// https://school.programmers.co.kr/learn/courses/30/lessons/181853

// 문제 설명
// 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int[] num_list) {
    int change = 0;
    for (int i = 0; i < num_list.length; i++) {
      for (int j = 0; j < num_list.length - 1; j++) {
        if (num_list[j] > num_list[j + 1]) {
          change = num_list[j];
          num_list[j] = num_list[j + 1];
          num_list[j + 1] = change;
          System.out.println(change);
        }
      }
    }
    num_list = Arrays.copyOfRange(num_list, 0, 5);
    return num_list;
  }
}