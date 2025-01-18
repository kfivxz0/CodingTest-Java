// https://school.programmers.co.kr/learn/courses/30/lessons/120956

// 문제 설명
// 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

//풀이
class Solution {
  public int solution(String[] babbling) {
    int answer = 0;
    String[] check = { "aya", "ye", "woo", "ma" };

    for (String b : babbling) { // babbling 에 있는 String 을 하나씩 꺼내옴
      for (String c : check) { // check 에 있는 String 을 하나씩 꺼내옴
        b = b.replace(c, " "); // b 에 c 가 있으면 일단 전부 공백으로 변경(나머지를 구분 하기위해)
      }
      if (b.replaceAll(" ", "").equals("")) { // 공백처리한 b 에 있는 공백을 없에고 남은게 아무것도 없으면
        answer++; // answer에 카운트+1
      }
    }
    return answer;
  }
}
