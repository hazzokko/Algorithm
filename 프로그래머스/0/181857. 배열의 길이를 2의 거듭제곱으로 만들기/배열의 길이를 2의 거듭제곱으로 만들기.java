class Solution {
    public int[] solution(int[] arr) {
        int num = arr.length;
        int temp = 1;
        
        while (temp < num) {
            temp *= 2;
        }

        int[] answer = new int[temp];
        
        for (int i = 0; i < answer.length; i++) {
            if (i < arr.length) {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}