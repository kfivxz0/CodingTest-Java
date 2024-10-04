// https://school.programmers.co.kr/learn/courses/30/lessons/138477

//풀이
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> rank = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}