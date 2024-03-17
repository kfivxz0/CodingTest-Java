// https://school.programmers.co.kr/learn/courses/30/lessons/181936

// 풀이
class Solution {
  public int solution(int number, int n, int m) {
      int answer = 0;
      boolean cond1 = number % n == 0;
      boolean cond2 = number % m == 0;
    
      if (cond1 && cond2) {
        answer = 1;
      } else {
        answer = 0;
      }
      return answer;
  }
}