class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;
        int num = 1;
        while(true) {
            sum *= num;
            if (sum > n) {
                answer = num;
                break;
            }
            num++;
        }
        return answer - 1;
    }
}