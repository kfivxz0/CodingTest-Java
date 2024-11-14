// https://school.programmers.co.kr/learn/courses/30/lessons/120583

// 문제 설명
// 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

// 풀이
class Solution {
  public int solution(int[] array, int n) {
    int answer = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        answer++;
      }
    }
    return answer;
  }
}
