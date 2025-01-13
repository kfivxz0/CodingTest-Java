// https://school.programmers.co.kr/learn/courses/30/lessons/120907

// 문제 설명
// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를
// 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public String[] solution(String[] quiz) {
    String[] answer = new String[quiz.length];

    for (int i = 0; i < quiz.length; i++) {
      String[] str = quiz[i].split(" ");
      int first = Integer.parseInt(str[0]);
      int second = Integer.parseInt(str[2]);
      int third = Integer.parseInt(str[4]);
      if ((quiz[i].contains(" + ") && first + second == third) ||
          (quiz[i].contains(" - ") && first - second == third)) {
        answer[i] = "O";
      } else {
        answer[i] = "X";
      }
    }

    return answer;
  }
}