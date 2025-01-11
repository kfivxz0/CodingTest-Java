// https://school.programmers.co.kr/learn/courses/30/lessons/120882

// 문제 설명
// 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열
// score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를
// 완성해주세요.

// 풀이
import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public int[] solution(int[][] score) {
    int[] answer = new int[score.length];
    int[] array = new int[score.length];
    for (int i = 0; i < score.length; i++) {
      array[i] = score[i][0] + score[i][1];
    }
    int[] sortedArray = Arrays.copyOf(array, array.length);
    Arrays.sort(sortedArray);
    HashMap<Integer, Integer> map = new HashMap<>();
    int rank = 1;
    for (int i = sortedArray.length - 1; i >= 0; i--) {
      if (!map.containsKey(sortedArray[i])) {
        map.put(sortedArray[i], rank);
      }
      rank++;
    }
    for (int i = 0; i < array.length; i++) {
      answer[i] = map.get(array[i]);
    }
    return answer;
  }
}