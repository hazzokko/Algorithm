import java.util.Arrays;

class Solution {
    public int solution(int i, int j, int k) {
        String s = "";
        for (int n = i; n <= j; n++) s += n;
        return (int) Arrays.stream(s.split("")).filter(x -> Integer.valueOf(x) == k).count();
    }
}