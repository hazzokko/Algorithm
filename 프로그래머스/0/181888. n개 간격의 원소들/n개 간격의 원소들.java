import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        for (int i = 0; i < num_list.length; i+=n) {
            answer[idx++] = num_list[i];
        }
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}