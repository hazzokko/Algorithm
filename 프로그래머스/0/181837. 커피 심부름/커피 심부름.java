class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (int i = 0; i < order.length; i++) {
            switch(order[i]) {
                case "iceamericano":
                    answer += 4500;
                    break;
                case "americanoice":
                    answer += 4500;
                    break;
                case "hotamericano":
                    answer += 4500;
                    break;
                case "americanohot":
                    answer += 4500;
                    break;
                case "americano":
                    answer += 4500;
                    break;
                case "anything":
                    answer += 4500;
                    break;
                case "icecafelatte":
                    answer += 5000;
                    break;
                case "cafelatteice":
                    answer += 5000;
                    break;
                case "hotcafelatte":
                    answer += 5000;
                    break;
                case "cafelattehot":
                    answer += 5000;
                    break;
                case "cafelatte":
                    answer += 5000;
                    break;
            }
        }
        
        return answer;
    }
}