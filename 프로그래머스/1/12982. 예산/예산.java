import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int answer = 0;
        
        Arrays.sort(d);
        for (int num : d) {
            budget -= num;
            if (budget < 0) break;
            answer++;
        }
        
        return answer;
    }
}