class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int strNum = (total/num) - ((num - 1)/2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = strNum;
            strNum++;
        }
        
        return answer;
    }
}