// https://school.programmers.co.kr/learn/courses/30/lessons/181897

// 문제 설명
// 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.

// n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
// n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
// n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
// n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
// 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int n, int[] slicer, int[] num_list) {
    int[] answer = {};

    if (n == 4) {
      int size = (slicer[1] - slicer[0]) / slicer[2] + 1;
      answer = new int[size];
      for (int i = 0; i < size; i++) {
        answer[i] = num_list[slicer[0] + i * slicer[2]];
      }
    } else if (n == 3) {
      answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
    } else if (n == 2) {
      answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
    } else {
      answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
    }

    return answer;
  }
}