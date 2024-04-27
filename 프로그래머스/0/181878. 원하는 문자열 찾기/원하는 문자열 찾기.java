class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String myStringResult = myString.toLowerCase();
        String patResult = pat.toLowerCase();
        
        if (myStringResult.contains(patResult)) {
            answer = 1;
        }
        
        return answer;
    }
}