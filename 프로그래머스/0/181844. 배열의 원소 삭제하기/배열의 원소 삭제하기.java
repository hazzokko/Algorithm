import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = new int[arr.length];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    check = true;
                    break;
                } 
            }
            
            if (!check) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        return Arrays.copyOf(answer, idx);
    }
}