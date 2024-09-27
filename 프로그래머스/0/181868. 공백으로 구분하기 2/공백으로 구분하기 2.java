import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {   
        String[] str = my_string.split(" ");
        String[] answer = new String[str.length];
        int idx = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                answer[idx] = str[i];
                idx++;
            }
        }
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}