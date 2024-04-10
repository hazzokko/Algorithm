class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0, countY = 0;
        
        String lowerCase = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (lowerCase.charAt(i) == 'p') {
                countP++;
            } else if (lowerCase.charAt(i) == 'y') {
                countY++;
            }
        }
        
        if (countP != countY) answer = false;
        
        return answer;
    }
}