// https://school.programmers.co.kr/learn/courses/30/lessons/42885

// 문제 설명
// 무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.

// 예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

// 구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.

// 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

//풀이
import java.util.Arrays;

class Solution {
  public int solution(int[] people, int limit) {
    int twoSafe = 0; // 한 번에 2명씩 구출된 횟수
    Arrays.sort(people); // 사람들의 무게를 오름차순으로 정렬

    int left = 0; // 왼쪽 인덱스
    int right = people.length - 1; // 오른쪽 인덱스

    while (left < right) {
      // left와 right의 무게 합이 limit 이하인 경우
      if (people[left] + people[right] <= limit) {
        left++; // 왼쪽 인덱스 증가
        right--; // 오른쪽 인덱스 감소
        twoSafe++; // 2명이 한 번에 구출된 횟수 증가

        // 무게 합이 limit를 초과하는 경우
      } else {
        right--; // 오른쪽 인덱스만 감소
      }
    }

    // 모든 사람의 수 - 한 번에 구출된 횟수(구명보트의 수)
    return people.length - twoSafe;
  }
}