// https://school.programmers.co.kr/learn/courses/30/lessons/120812

// 문제 설명
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

// 풀이
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int solution(int[] array) {
    int maxCount = 0;
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int number : array) {
      int count = map.getOrDefault(number, 0) + 1;
      if (count > maxCount) {
        maxCount = count;
        answer = number;
      } else if (count == maxCount) {
        answer = -1;
      }
      map.put(number, count);
    }
    return answer;
  }
}