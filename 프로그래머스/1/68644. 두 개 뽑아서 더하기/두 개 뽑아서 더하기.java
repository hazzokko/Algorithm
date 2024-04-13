import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = arr.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}