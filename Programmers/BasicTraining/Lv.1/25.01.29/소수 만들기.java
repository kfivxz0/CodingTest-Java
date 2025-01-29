// https://school.programmers.co.kr/learn/courses/30/lessons/12977

// 문제 설명
// 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질
// 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를
// 완성해주세요.
// 제한사항
// nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
// nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

// 풀이
import java.util.ArrayList;

public class Solution {

  public int solution(int[] nums) {
    int answer = 0;

    // 합을 저장할 저장공간 선언
    ArrayList<Integer> list = new ArrayList<Integer>();
    // for문을 이용하여 배열의 합을 구한다.
    for (int i = 0; i < nums.length; i++) {
      if (i + 2 >= nums.length)
        break;
      for (int j = i + 1; j < nums.length; j++) {
        for (int h = j + 1; h < nums.length; h++) {
          list.add(nums[i] + nums[j] + nums[h]);
        }
      }
    }

    // 저장된 합이 소수인지 판별한다.
    for (Integer i : list) {
      int count = 2;
      answer++;
      while (count < i) {
        // 저장된 값이 count로 나눴을 때 나머지가 0이라면 소수가 아니기 때문에 answer의 값을 더하지 않는다.
        if (i % count == 0) {
          answer--;
          break;
        }
        count++;
      }
    }
    return answer;
  }
}