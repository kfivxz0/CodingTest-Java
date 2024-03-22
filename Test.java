
// class Solution {
// public int[] solution(int[] num_list) {
// int[] answer = { num_list.length + 1 };
// int n = 0;

// if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
// n = num_list[num_list.length - 1] - num_list[num_list.length - 2];

// } else {
// n = num_list[num_list.length - 1] * 2;

// }

// for (int i = 0; i < answer.length; i++) {
// answer[i] = num_list[i];
// }
// answer[answer.length - 1] = n;
// return answer;
// }

// }