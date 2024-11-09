// https://school.programmers.co.kr/learn/courses/30/lessons/120906

// 문제 설명
// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

//풀이
import java.util.*;

public class Solution {
  public int solution(int n) {
    int answer = 0;

    String[] str = Integer.toString(n).split("");

    for (String s : str) {
      answer += Integer.parseInt(s);
    }

    return answer;
  }
}