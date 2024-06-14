// https://school.programmers.co.kr/learn/courses/30/lessons/181931

// 문제 설명
// 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public int solution(int a, int d, boolean[] included) {
    int answer = 0;
    int[] arr = new int[included.length];
    arr[0] = a;

    // 등차수열을 배열에 담기
    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i - 1] + d;
    }
    // included가 true인 항들만 더하기
    for (int j = 0; j < included.length; j++) {
      if (included[j] == true) {
        answer += arr[j];
      }
    }

    return answer;
  }
}