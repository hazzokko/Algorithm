class Solution {
    public int solution(int[] date1, int[] date2) {
        String num1 = "", num2 = "";
        int result1 = 0, result2 = 0;
        for (int i = 0; i < 3; i++) {
            num1 += date1[i];
            num2 += date2[i];
        }
        result1 = Integer.parseInt(num1);
        result2 = Integer.parseInt(num2);
        return result1 < result2 ? 1 : 0;
    }
}