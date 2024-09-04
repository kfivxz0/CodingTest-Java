https://school.programmers.co.kr/learn/courses/30/lessons/181892

// 풀이
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list, n-1, num_list.length);

        return answer;
    }
}