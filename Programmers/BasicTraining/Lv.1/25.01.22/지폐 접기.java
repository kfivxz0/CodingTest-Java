// https://school.programmers.co.kr/learn/courses/30/lessons/340199

// 문제 설명
// 민수는 다양한 지폐를 수집하는 취미를 가지고 있습니다. 지폐마다 크기가 달라 지갑에 넣으려면 여러 번 접어서 넣어야 합니다. 예를 들어
// 지갑의 크기가 30 * 15이고 지폐의 크기가 26 * 17이라면 한번 반으로 접어 13 * 17 크기로 만든 뒤 90도 돌려서 지갑에
// 넣을 수 있습니다. 지폐를 접을 때는 다음과 같은 규칙을 지킵니다.
// 지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접습니다.
// 접기 전 길이가 홀수였다면 접은 후 소수점 이하는 버립니다.
// 접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있다면 그만 접습니다.
// 지갑의 가로, 세로 크기를 담은 정수 리스트 wallet과 지폐의 가로, 세로 크기를 담은 정수 리스트 bill가 주어질 때, 지갑에 넣기
// 위해서 지폐를 최소 몇 번 접어야 하는지 return하도록 solution함수를 완성해 주세요.

// 풀이
class Solution {
  public int solution(int[] wallet, int[] bill) {
    int answer = 0;
    int walletMax = Math.max(wallet[0], wallet[1]);
    int walletMin = Math.min(wallet[0], wallet[1]);
    int billMax = Math.max(bill[0], bill[1]);
    int billMin = Math.min(bill[0], bill[1]);

    // 지갑의 큰 길이가 지폐의 큰 길이보다 같거나 크고, 지갑의 작은 길이가 지폐의 작은 길이보다 같거나 클때까지 반복
    while (walletMax < billMax || walletMin < billMin) {

      // 화폐의 큰 길이로 접기
      if (bill[0] >= bill[1]) {
        bill[0] /= 2;
      } else {
        bill[1] /= 2;
      }
      billMax = Math.max(bill[0], bill[1]);
      billMin = Math.min(bill[0], bill[1]);
      answer++;
    }

    return answer;
  }
}