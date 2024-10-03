// https://school.programmers.co.kr/learn/courses/30/lessons/12915

// 문제 설명
// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

//풀이
import java.util.*;

class Solution {
  public String[] solution(String[] strings, int n) {
    String[] answer = new String[strings.length];
    List<String> list = new ArrayList<>();

    for (int i = 0; i < strings.length; i++) {
      list.add(strings[i].charAt(n) + strings[i]);
    }

    Collections.sort(list);

    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i).substring(1);
    }

    return answer;
  }
}