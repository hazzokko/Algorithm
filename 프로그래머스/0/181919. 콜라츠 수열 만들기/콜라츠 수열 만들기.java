import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int idx = 1;
        answer[0] = n;
        
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            answer[idx++] = n;
        }
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}