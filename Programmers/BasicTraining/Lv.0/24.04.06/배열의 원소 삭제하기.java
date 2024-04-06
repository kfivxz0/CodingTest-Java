// https://school.programmers.co.kr/learn/courses/30/lessons/181844

// 문제 설명
// 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List solution(int[] arr, int[] delete_list) {
    List<Integer> answer = new ArrayList<>();
    for (int num : arr) {
      answer.add(num);
    }

    for (int del : delete_list) {
      int index = answer.indexOf(del);

      if (index != -1) {
        answer.remove(index);
      }
    }

    return answer;
  }
}