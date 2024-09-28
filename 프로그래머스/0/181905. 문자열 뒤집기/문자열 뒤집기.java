class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp = my_string.substring(0, s);
        String temp1 = my_string.substring(e + 1);
        
        for (int i = e; i >= s; i--) {
            answer += my_string.charAt(i);
        }

        return temp + answer + temp1;
    }
}