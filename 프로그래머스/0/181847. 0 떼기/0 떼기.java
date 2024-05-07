class Solution {
    public String solution(String n_str) {
        int count = 0;
        
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') break;
            if (n_str.charAt(i) == '0') {
                count++;
            }
        }
        
        return n_str.substring(count);
    }
}