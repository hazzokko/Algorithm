interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        float credit = 0.0f; // 과목평점
        float creditSum = 0.0f; // 학점의 총합
        float sum = 0.0f; // (학점 * 과목평점)의 총합
        
        for (int i = 0; i < 20; i++) {
            String[] temp = v.nextLine().split(" ");
            if (!temp[2].equals("P")) {
                switch (temp[2]) {
                    case "A+":
                        credit = 4.5f;
                        break;
                    case "A0":
                        credit = 4.0f;
                        break;
                    case "B+":
                        credit = 3.5f;
                        break;
                    case "B0":
                        credit = 3.0f;
                        break;
                    case "C+":
                        credit = 2.5f;
                        break;
                    case "C0":
                        credit = 2.0f;
                        break;
                    case "D+":
                        credit = 1.5f;
                        break;
                    case "D0":
                        credit = 1.0f;
                        break;
                    case "F":
                        credit = 0.0f;
                        break;
                }
                sum += credit * Float.valueOf(temp[1]);
                creditSum += Float.valueOf(temp[1]);
            }
        }
        
        System.out.printf("%.6f", sum/creditSum);
    }
}