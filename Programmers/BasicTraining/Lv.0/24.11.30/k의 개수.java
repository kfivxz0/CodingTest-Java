// https://school.programmers.co.kr/learn/courses/30/lessons/120887

// 문제 설명
// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때,
// i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public int solution(int i, int j, int k) {
    int answer = 0;
    String strK = String.valueOf(k);
    for (int a = i; a <= j; a++) {
      String str = String.valueOf(a);
      if (str.contains(strK)) {
        String[] strArr = str.split("");
        for (int b = 0; b < strArr.length; b++) {
          if (strArr[b].equals(strK))
            answer++;
        }
      }

    }
    return answer;
  }
}