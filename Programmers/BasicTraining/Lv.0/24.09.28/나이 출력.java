// https://school.programmers.co.kr/learn/courses/30/lessons/120820

// 문제 설명
// 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요

// 풀이
class Solution {
  public int solution(int age) {
    int answer = 0;

    if (age > 0 && age <= 120) {
      answer = 2022 - age + 1;
    }

    return answer;
  }
}