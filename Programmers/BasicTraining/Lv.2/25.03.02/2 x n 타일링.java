// https://school.programmers.co.kr/learn/courses/30/lessons/12900

// 문제 설명
// 가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다. 이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가
// n인 바닥을 가득 채우려고 합니다. 타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.

// 타일을 가로로 배치 하는 경우
// 타일을 세로로 배치 하는 경우
// 예를들어서 n이 7인 직사각형은 다음과 같이 채울 수 있습니다.

// 직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를
// 완성해주세요.

// 풀이
import java.util.*;

class Solution {
  public int solution(int n) {
    int answer = 0;

    int[] arr = new int[n];
    arr[0] = 1;
    arr[1] = 2;

    for (int i = 2; i < n; i++) {
      int num = arr[i - 1] + arr[i - 2];
      arr[i] = num % 1000000007;
    }

    return arr[n - 1];
  }
}