class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int num1 = Integer.parseInt(temp[0]);
            int num2 = Integer.parseInt(temp[2]);
            int result = Integer.parseInt(temp[4]);
            if (temp[1].equals("-")) {
                if ((num1 - num2) == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if ((num1 + num2) == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}