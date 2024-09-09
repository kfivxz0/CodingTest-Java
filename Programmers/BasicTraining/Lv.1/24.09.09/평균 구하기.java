// https://school.programmers.co.kr/learn/courses/30/lessons/12944

// 문제 설명
// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

//풀이
class Solution {
  public double solution(int[] arr) {
    double answer = 0;
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    answer = sum / arr.length;
    return answer;
  }
}