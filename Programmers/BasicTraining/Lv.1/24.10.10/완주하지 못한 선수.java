// https://school.programmers.co.kr/learn/courses/30/lessons/42576

// 문제 설명
// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

//풀이
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution_Hash {
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> map = new HashMap<>();
    for (String player : participant)
      map.put(player, map.getOrDefault(player, 0) + 1);
    for (String player : completion)
      map.put(player, map.get(player) - 1);

    Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

    while (iter.hasNext()) {
      Map.Entry<String, Integer> entry = iter.next();
      if (entry.getValue() != 0) {
        answer = entry.getKey();
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String[] part = { "leo", "kiki", "eden" };
    String[] comp = { "eden", "kiki" };
    Solution_Sort sol = new Solution_Sort();
    System.out.println(sol.solution(part, comp));
  }
}