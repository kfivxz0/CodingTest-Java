// https://school.programmers.co.kr/learn/courses/30/lessons/87389

// 문제 설명
// 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

// 풀이
class Solution {
  public int solution(int n) {
      int answer = 0;
      
      for ( int x=2 ; x < n; x++){
          if(n % x == 1){
             answer =x;
              break;	// break문으로 최소값 구하면 빠져나오기
          }
      }
      return answer;
  }
}출처:https:// yegenie2.tistory.com/16 [Dev Note:티스토리]