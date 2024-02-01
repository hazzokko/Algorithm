class Solution {
    public int solution(int num) {
        int answer = 0;
        long a = (long) num;
        while (a != 1) {
            if (answer == 500) {
                return -1;
            } else if (a % 2 == 0) {
                a /= 2;
                answer++;
            } else if (a % 2 == 1) {
                a = (a * 3) + 1;
                answer++;
            } 
        }
        return answer;
    }
}