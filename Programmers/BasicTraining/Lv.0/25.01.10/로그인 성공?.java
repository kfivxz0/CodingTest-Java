// https://school.programmers.co.kr/learn/courses/30/lessons/120883

// 문제 설명
// 머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열
// db가 주어질 때, 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.

// 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
// 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong
// pw”를 return 합니다.

// 풀이
class Solution {
  public String solution(String[] id_pw, String[][] db) {

    String answer = "";
    for (int i = 0; i < db.length; i++) {
      if (id_pw[0].equals(db[i][0])) {
        if (id_pw[1].equals(db[i][1])) {
          answer = "login";
        } else {
          answer = "wrong pw";
        }
      }
    }

    if (answer == "") {
      answer = "fail";
    }

    return answer;
  }
}