// https://school.programmers.co.kr/learn/courses/30/lessons/76502

// 문제 설명
// 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
// (), [], {} 는 모두 올바른 괄호 문자열입니다.
// 만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호
// 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
// 만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로,
// {}([]) 도 올바른 괄호 문자열입니다.
// 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼
// 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Stack;

class Solution {
  public int solution(String s) {
    // 올바른 괄호 문자열의 개수를 저장할 변수
    int answer = 0;

    for (int i = 0; i < s.length(); i++) {
      // 주어진 문자열이 올바른 괄호 문자열인지 검사
      if (verification(s)) {
        answer++;
      }

      // 문자열을 한 칸씩 회전
      s = shift(s);
    }

    return answer;
  }

  // 올바른 괄호인지 검사하는 함수
  private boolean verification(String s) {
    // 괄호를 저장할 스택
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      // 여는 괄호면 스택에 push
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      } else {
        // 스택이 비어있는 경우
        if (stack.isEmpty()) {
          return false;
        }

        // 짝이 맞는 괄호면 스택에서 pop
        if (stack.peek() == '(' && s.charAt(i) == ')') {
          stack.pop();
        } else if (stack.peek() == '{' && s.charAt(i) == '}') {
          stack.pop();
        } else if (stack.peek() == '[' && s.charAt(i) == ']') {
          stack.pop();
          // 짝이 맞지 않는 경우 false
        } else
          return false;
      }
    }

    return stack.isEmpty();
  }

  // 문자열 회전(부분문자열 활용)
  private String shift(String s) {
    return s.substring(1) + s.charAt(0);
  }
}