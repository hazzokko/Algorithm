import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        String[] answer = Arrays.stream(temp)
                            .filter(x -> !x.isEmpty())
                            .sorted()
                            .toArray(String[]::new);
        
        return answer;
    }
}