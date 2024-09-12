// https://school.programmers.co.kr/learn/courses/30/lessons/12933

// 문제 설명
// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

//풀이
class Solution {
  public long solution(long n) {
    String answer = "";
    String str = Long.toString(n);

    int[] arr = new int[str.length()];

    // long타입의 숫자를 Int배열로 올긴다.
    for (int i = 0; i < str.length(); i++) {
      String s = str.substring(i, i + 1);
      arr[i] = Integer.parseInt(s);
    }

    // 내림차순 정렬
    for (int j = 0; j < str.length() - 1; j++) {
      for (int i = 0; i < str.length() - 1; i++) {
        if (arr[i] < arr[i + 1]) {
          int tmp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = tmp;
        }
      }
    }

    for (int i = 0; i < str.length(); i++) {
      answer += arr[i];
    }

    return Long.parseLong(answer);
  }
}
