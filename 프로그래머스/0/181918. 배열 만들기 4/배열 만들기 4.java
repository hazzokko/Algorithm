import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (tmp.size() == 0) {
                tmp.add(arr[i]);
            } else if (tmp.get(tmp.size() - 1) < arr[i]) {
                tmp.add(arr[i]);
            } else if (tmp.get(tmp.size() - 1) >= arr[i]) {
               tmp.remove(tmp.size() - 1);
               i--;
            }
        }
        
        int[] stk = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            stk[i] = tmp.get(i);
        }
        
        return stk;
    }
}