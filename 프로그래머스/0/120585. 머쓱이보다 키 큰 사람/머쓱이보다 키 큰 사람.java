import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        return answer = (int) Arrays.stream(array).filter(x -> x > height).count();
    }
}