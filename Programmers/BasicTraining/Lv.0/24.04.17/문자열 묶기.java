// https://school.programmers.co.kr/learn/courses/30/lessons/181855

// 문제 설명
// 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

// 풀이
import java.util.*;

class Solution {
  public int solution(String[] strArr) {
    int answer = 0;
    Map<Integer, Integer> cnt = new HashMap<>();
    for (String str : strArr) {
      cnt.merge(str.length(), 1, (v1, v2) -> {
        return v1 + 1;
      });
    }
    for (int key : cnt.keySet()) {
      answer = Math.max(answer, cnt.get(key));
    }
    return answer;
  }
}