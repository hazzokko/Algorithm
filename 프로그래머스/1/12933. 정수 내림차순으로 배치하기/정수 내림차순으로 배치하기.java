import java.util.*;

class Solution {
    public long solution(long n) {
        String temp = "";
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String s : arr) temp += s;
        
        return Long.parseLong(temp);
    }
}