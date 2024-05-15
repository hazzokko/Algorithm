import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int sum = (int) Arrays.stream(arr).sum();
        int[] answer = new int[sum];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}