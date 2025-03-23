class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            arr[len]++;
        }
        
        for (int count : arr) {
            answer = Math.max(answer, count);
        }

        return answer;
    }
}