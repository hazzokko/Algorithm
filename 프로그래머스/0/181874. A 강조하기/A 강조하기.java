class Solution {
    public String solution(String myString) {
        String answer = "";
        
        answer = myString.toLowerCase();
        
        if (answer.contains("a")) {
            answer = answer.replace("a", "A");
        }
        
        return answer;
    }
}