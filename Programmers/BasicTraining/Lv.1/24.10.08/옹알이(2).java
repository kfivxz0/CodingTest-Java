// https://school.programmers.co.kr/learn/courses/30/lessons/133499

// 문제 설명
// 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

//풀이
class Solution {
  public int solution(String[] babblings) {
    int answer = 0;
    for (int i = 0; i < babblings.length; i++) {
      if (babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo")
          || babblings[i].contains("mama")) {
        continue;
      }

      babblings[i] = babblings[i].replace("aya", " ");
      babblings[i] = babblings[i].replace("ye", " ");
      babblings[i] = babblings[i].replace("woo", " ");
      babblings[i] = babblings[i].replace("ma", " ");
      babblings[i] = babblings[i].replace(" ", "");

      if (babblings[i].length() == 0)
        answer++;

    }
    return answer;
  }
}