import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int len = intStrs.length;
        int idx = 0;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmp > k) {
                answer[idx++] = tmp;
            }
        }
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}