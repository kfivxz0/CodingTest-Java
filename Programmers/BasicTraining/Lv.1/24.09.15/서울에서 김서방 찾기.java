// https://school.programmers.co.kr/learn/courses/30/lessons/12919

// 문제 설명
// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

//풀이
class Solution {
  public String solution(String[] seoul) {
    String answer = "";

    for (int i = 0; i < seoul.length; i++) {
      if (seoul[i].equals("Kim")) {
        answer = "김서방은 " + i + "에 있다";
        break;
      }
    }

    return answer;
  }
}