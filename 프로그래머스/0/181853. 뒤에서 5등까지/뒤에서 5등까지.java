class Solution {
    public int[] solution(int[] num_list) {
        
        
        int temp_num = 0;
        int length = num_list.length;
        
        int[] temp_answer = new int[num_list.length];
        int[] answer = new int[5];
        
        for(int j=0; j<length; j++){
            temp_answer[j] = 101;
            for(int i=0; i<length; i++){
                if(temp_answer[j] > num_list[i]){
                    temp_answer[j] = num_list[i];
                    temp_num = i;
                }
            }
            num_list[temp_num]=101;
        }
        
        System.arraycopy(temp_answer, 0, answer, 0, 5);
        
        return answer;
    }
}