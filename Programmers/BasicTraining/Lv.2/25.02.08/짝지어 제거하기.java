// https://school.programmers.co.kr/learn/courses/30/lessons/12973

// 문제 설명
// 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
// 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
// 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 성공적으로 수행할 수 있으면
// 1을, 아닐 경우 0을 리턴해주면 됩니다.
// 예를 들어, 문자열 S = baabaa 라면
// b aa baa → bb aa → aa →
// 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.

// 풀이
import java.util.*;

class Solution {
  public int solution(String s) {
    int answer = -1;
    char[] carr = s.toCharArray();
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < carr.length; i++) {
      char c = carr[i];
      // 스택이 비어있다면 현재 문자는 반복될 일이 없으므로 push
      if (stack.isEmpty())
        stack.push(c);
      // 스택이 비어있지 않다면
      else {
        // 스택의 top확인(peek) - 만약 현재 문자와 같다면 반복이므로 스택에서 pop하고 현재 문자도 스택에 넣지 않음
        // 이렇게 되면 스택에는 반복이 발생하는 이전문자와 현재문자 모두 들어가지 않게 됨 (반복제거)
        if (stack.peek() == c) {
          stack.pop();
          // 스택의 top이 현재 문자와 다르다면 반복이 아니므로 push
        } else {
          stack.push(c);
        }
      }
    }
    // 스택에 남아있는 값들은 반복되지 않는 값들임 즉, 비어있어다면 모두 짝지어 반복된 것
    return stack.isEmpty() ? 1 : 0;
  }
}
