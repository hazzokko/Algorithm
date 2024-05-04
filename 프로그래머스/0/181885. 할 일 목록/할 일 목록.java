import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[todo_list.length];
        int idx = 0;
        
        for (int i = 0; i < answer.length; i++) {
            if (finished[i] == false) {
                answer[idx++] = todo_list[i];
            }
        }
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}