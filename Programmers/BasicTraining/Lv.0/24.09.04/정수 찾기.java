// https://school.programmers.co.kr/learn/courses/30/lessons/181840

// 풀이
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] == n){
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}