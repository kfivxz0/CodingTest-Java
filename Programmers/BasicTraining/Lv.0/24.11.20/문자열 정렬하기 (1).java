// https://school.programmers.co.kr/learn/courses/30/lessons/120850

// 문제 설명
// 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록
// solution 함수를 작성해보세요.

// 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(String my_string) {

    int[] array = new int[100];

    int count = 0;

    for (int i = 0; i < my_string.length(); i++) {
      if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
        array[count] = my_string.charAt(i) - '0';
        count++;
      }
    }

    int[] answer = new int[count];

    for (int i = 0; i < count; i++) {
      answer[i] = array[i];
    }

    Arrays.sort(answer);

    return answer;
  }
}