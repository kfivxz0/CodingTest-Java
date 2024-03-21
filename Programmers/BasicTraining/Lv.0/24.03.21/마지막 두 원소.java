// https://school.programmers.co.kr/learn/courses/30/lessons/181927

// 문제 설명
// 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution {
  public int[] solution(int[] num_list) {
    int l = num_list.length;
    int[] newArr = Arrays.copyOf(num_list, l + 1);
    int n = 0;

    if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
      n = num_list[num_list.length - 1] - num_list[num_list.length - 2];

    } else {
      n = num_list[num_list.length - 1] * 2;
    }
    newArr[l] = n;

    return newArr;
  }
}
