class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String answer = "";
        for (int i = 0; i < len; i++) {
            if (i < len - 4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }
}