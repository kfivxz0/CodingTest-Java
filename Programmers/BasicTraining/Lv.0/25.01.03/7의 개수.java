// https://school.programmers.co.kr/learn/courses/30/lessons/120912

// 문제 설명
// 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록
// solution 함수를 완성해보세요.

// 풀이
class Solution {
  public int solution(int[] array) {

    String num = "";
    for (int i = 0; i < array.length; i++) {
      num += array[i];
    }

    char[] strChar = num.toCharArray();
    int answer = 0;

    System.out.println();

    for (int i = 0; i < strChar.length; i++) {
      System.out.print(strChar[i]);
      if (strChar[i] == '7') {
        answer++;
      }
    }
    return answer;
  }
}