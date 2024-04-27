// https://school.programmers.co.kr/learn/courses/30/lessons/181838

// 문제 설명
// 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
// 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.

class Solution {
  public int solution(int[] date1, int[] date2) {
    if (date1[0] != date2[0]) {
      return date1[0] < date2[0] ? 1 : 0;
    }
    if (date1[1] != date2[1]) {
      return date1[1] < date2[1] ? 1 : 0;
    }
    if (date1[2] != date2[2]) {
      return date1[2] < date2[2] ? 1 : 0;
    }
    return 0;
  }
}