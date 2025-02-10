// https://school.programmers.co.kr/learn/courses/30/lessons/131701

// 문제 설명
// 철호는 수열을 가지고 놀기 좋아합니다. 어느 날 철호는 어떤 자연수로 이루어진 원형 수열의 연속하는 부분 수열의 합으로 만들 수 있는 수가
// 모두 몇 가지인지 알아보고 싶어졌습니다. 원형 수열이란 일반적인 수열에서 처음과 끝이 연결된 형태의 수열을 말합니다. 예를 들어 수열
// [7, 9, 1, 1, 4] 로 원형 수열을 만들면 다음과 같습니다.
// 원형 수열은 처음과 끝이 연결되어 끊기는 부분이 없기 때문에 연속하는 부분 수열도 일반적인 수열보다 많아집니다.
// 원형 수열의 모든 원소 elements가 순서대로 주어질 때, 원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수를 return
// 하도록 solution 함수를 완성해주세요.

// 풀이
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public int solution(int[] elements) {
    // elements의 2배 크기의 배열 생성
    int[] newElements = new int[elements.length * 2];

    // newElements의 i와 i + elements.length 위치에 elements[i] 저장
    for (int i = 0; i < elements.length; i++) {
      newElements[i] = elements[i];
      newElements[i + elements.length] = elements[i];
    }

    // 중복을 제거하기 위한 Set 생성
    Set<Integer> set = new HashSet<>();

    // 부분 수열의 합 구하기
    for (int i = 0; i < elements.length; i++) {
      for (int j = 0; j < elements.length; j++) {
        // 새 배열에서 j부터 j+i-1까지의 부분 배열의 합을 구하고 Set에 추가
        set.add(Arrays.stream(newElements, j, j + i).sum());
      }
    }

    // 개수 반환
    return set.size();
  }
}