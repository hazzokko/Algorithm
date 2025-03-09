import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] tmp = new int[arr.length];
        int idx = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                tmp[idx++] = num;
            }
        }
        int[] answer = Arrays.copyOfRange(tmp, 0, idx);
        Arrays.sort(answer);
        
        if (idx == 0) {
            return new int[]{-1};
        }
        
        return answer;
    }
}