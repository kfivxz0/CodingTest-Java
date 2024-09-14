//https://school.programmers.co.kr/learn/courses/30/lessons/86051

// 문제 설명
// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

//풀이
class Solution {
  public int solution(int[] numbers) {
    int answer = 0;
    int[] answ = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      answ[numbers[i]] = 1;
    }

    for (int i = 0; i < answ.length; i++) {
      if (answ[i] == 0)
        answer += i;
    }

    return answer;
  }
}