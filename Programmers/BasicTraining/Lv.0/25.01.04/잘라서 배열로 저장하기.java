// https://school.programmers.co.kr/learn/courses/30/lessons/120913

// 문제 설명
// 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

// 풀이
class Solution {
  public String[] solution(String my_str, int n) {
    int length = (int) Math.ceil((double) my_str.length() / n);
    String[] answer = new String[length];

    int index = 0;
    for (int i = 0; i < length - 1; i++) {
      answer[i] = my_str.substring(index, n * (i + 1));
      index += n;
    }
    answer[length - 1] = my_str.substring(index);

    return answer;
  }
}
