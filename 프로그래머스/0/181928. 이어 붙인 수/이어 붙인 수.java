class Solution {
    public int solution(int[] num_list) {
        String temp1 = "";
        String temp2 = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                temp1 += num_list[i];
            } else {
                temp2 += num_list[i];
            }
        }
        return Integer.parseInt(temp1) + Integer.parseInt(temp2);
    }
}