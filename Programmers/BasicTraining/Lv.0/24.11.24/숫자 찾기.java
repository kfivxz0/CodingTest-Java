// https://school.programmers.co.kr/learn/courses/30/lessons/120904

// 문제 설명
// 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
// 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

// 풀이
class Solution {
  public int solution(int num, int k) {
    int answer = -1;

    String str = String.valueOf(num);
    char ch = (char) (k + '0');

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) {
        answer = i + 1;
        break;
      }
    }
    return answer;
  }
}