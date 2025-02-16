class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            answer[idx++] = Integer.valueOf(arr[i]);
        }
        return answer;
    }
}