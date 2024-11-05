// https://school.programmers.co.kr/learn/courses/30/lessons/120847

// 문제 설명
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

//풀이
import java.util.*;

class Solution {
  public int solution(int[] numbers) {

    Arrays.sort(numbers);
    return numbers[numbers.length - 1] * numbers[numbers.length - 2];

  }
}