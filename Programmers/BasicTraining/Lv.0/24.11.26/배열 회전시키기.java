// https://school.programmers.co.kr/learn/courses/30/lessons/120844

// 문제 설명
// 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로
// 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int[] solution(int[] numbers, String direction) {
    int[] answer = new int[numbers.length];

    if (direction.equals("right")) {
      answer[0] = numbers[numbers.length - 1];
      for (int i = 1; i < answer.length; i++) {
        answer[i] = numbers[i - 1];
      }
    } else {
      answer[numbers.length - 1] = numbers[0];
      for (int i = 0; i < answer.length - 1; i++) {
        answer[i] = numbers[i + 1];
      }
    }
    return answer;
  }
}