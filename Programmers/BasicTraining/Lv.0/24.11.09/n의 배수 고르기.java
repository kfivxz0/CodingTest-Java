// https://school.programmers.co.kr/learn/courses/30/lessons/120905

// 문제 설명
// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

//풀이
import java.util.*;

class Solution {
  public int[] solution(int n, int[] numlist) {

    ArrayList<Integer> temp = new ArrayList<>();
    for (int i = 0; i < numlist.length; i++) {
      if (numlist[i] % n == 0) {
        temp.add(numlist[i]);
      }
    }

    int[] result = new int[temp.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = temp.get(i);
    }

    return result;
  }
}