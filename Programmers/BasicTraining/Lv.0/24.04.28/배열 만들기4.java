// https://school.programmers.co.kr/learn/courses/30/lessons/181918

// 문제 설명
// 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
// 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
// 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
// stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
// stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
// 위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.

import java.util.ArrayList;

class Solution {
  public int[] solution(int[] arr) {
    ArrayList<Integer> tmp = new ArrayList();

    int i = 0;
    while (i < arr.length) {

      if (tmp.size() == 0) {
        tmp.add(arr[i]);
        i = i + 1;
      } else {
        int last = tmp.get(tmp.size() - 1);
        if (tmp.size() != 0 && last < arr[i]) {
          tmp.add(arr[i]);
          i = i + 1;
        } else if (tmp.size() != 0 && last >= arr[i]) {
          tmp.remove(tmp.size() - 1);
        }
      }

    }

    int stk[] = new int[tmp.size()];
    for (int k = 0; k < tmp.size(); k++) {
      stk[k] = tmp.get(k).intValue();
    }
    return stk;
  }
}
