import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();
        arr = Arrays.stream(arr).filter(n -> n != min).toArray();

        if (arr.length == 0) {
            return new int[]{-1};
        }

        return arr;
    }
}