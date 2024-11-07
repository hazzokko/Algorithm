import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a, b, c};
        arr = Arrays.stream(arr).distinct().toArray();
        int len = arr.length;
        
        if (len == 3) {
            answer = a + b + c;
        } else if (len == 2) {
            answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } else {
            answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        }
        
        return answer;
    }
}