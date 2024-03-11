class Solution {
    public int solution(int[] num_list) {
        int answer = 0, sum = 0, mul = 1;
        for (int num : num_list) {
            if (num_list.length >= 11) {
                sum += num;
                answer = sum;
            } else {
                mul *= num;
                answer = mul;
            }
        }
        return answer;
    }
}