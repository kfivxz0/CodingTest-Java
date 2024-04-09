// https://school.programmers.co.kr/learn/courses/30/lessons/181857

// 문제 설명
// 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.

// 풀이
class Solution {
  public int[] solution(int[] arr) {
    int length = arr.length;

    if (length == 1) {
      return arr;
    }

    int x = 0;
    int y = 0;
    int len = arr.length;

    while (len > x) {
      x = (int) Math.pow(2, y++);
    }

    int[] answer = new int[x];
    for (int i = 0; i < arr.length; i++) {
      answer[i] = arr[i];
    }

    return answer;
  }
}