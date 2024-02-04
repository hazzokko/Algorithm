import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int numSum = 0;
        for (int i = 0; i < 10; i++) sum += i;
        for (int j = 0; j < numbers.length; j++) numSum += numbers[j];
        return sum - numSum;
    }
}