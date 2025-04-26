import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        ArrayList<Integer> dynamicArray = new ArrayList<>(); 
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            for (int j = start; j <= end; j++) {
                dynamicArray.add(arr[j]);
            }
        }
        
        int[] answer = new int[dynamicArray.size()];
        for (int i = 0; i < dynamicArray.size(); i++) {
            answer[i] = dynamicArray.get(i);
        }
        
        return answer;
    }
}