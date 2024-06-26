// https://school.programmers.co.kr/learn/courses/30/lessons/181851

// 문제 설명
// 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
// 각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다. 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.

// 풀이
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int solution(int[] rank, boolean[] attendance) {
    int a = 0;
    int b = 0;
    int c = 0;
    int answer = 0;
    Map<int, int> map = new HashMap<>;

    for (int i = 0; i < rank.length; i++) { // 학생 수만큼 반복
      if (attendance[i]) {
          map.put(i, rank[i]);  // k = index, v = rank
      }
    }
    System.out.println(list);
      
      
      
    
    a = list.get(0);
    b = list.get(1);
    c = list.get(2);
    answer = 10000 * a + 100 * b + c;

    return answer;
  }
}