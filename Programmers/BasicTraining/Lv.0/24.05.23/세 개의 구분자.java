// https://school.programmers.co.kr/learn/courses/30/lessons/181862

// 문제 설명
// 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.

// 예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가
// 됩니다.

// 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는
// solution 함수를 완성해 주세요.

// 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를
// return 합니다.

// 풀이
import java.util.*;

class Solution {
  public List solution(String myStr) {
    List<String> list = new ArrayList<String>();
    String temp = "";
    for (int i = 0; i < myStr.length(); i++) {
      char value = myStr.charAt(i);

      if (value == 'a' || value == 'b' || value == 'c') {
        // 빈 스트링이 아니고 이미 저장해온 값이 있다면?
        if (temp != "") {
          list.add(temp);
          temp = "";
        }
      } else {
        temp += value;
      }
    }
    if (temp != "") {
      list.add(temp);
      temp = "";
    }

    if (list.size() == 0)
      list.add("EMPTY");
    return list;
  }
}