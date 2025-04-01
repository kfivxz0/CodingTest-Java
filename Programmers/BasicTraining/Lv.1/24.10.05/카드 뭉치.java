// https://school.programmers.co.kr/learn/courses/30/lessons/159994

// 문제 설명
// 코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.

// 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
// 한 번 사용한 카드는 다시 사용할 수 없습니다.
// 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
// 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
// 예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"], 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
// 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.

//풀이
class Solution {
  public String solution(String[] cards1, String[] cards2, String[] goal) {
    String answer = "Yes"; // 기본 값 "Yes"로 설정
    int idx1 = 0; // cards1의 인덱스
    int idx2 = 0; // cards2의 인덱스

    // goal 배열의 각 문자열을 순회
    for (String str : goal) {
      if (idx1 < cards1.length && cards1[idx1].equals(str)) {
        idx1++; // cards1에서 일치하면 idx1 증가
      } else if (idx2 < cards2.length && cards2[idx2].equals(str)) {
        idx2++; // cards2에서 일치하면 idx2 증가
      } else {
        answer = "No"; // 두 카드 더미 모두에서 일치하지 않으면 "No"
        break;
      }
    }

    return answer;
  }
}