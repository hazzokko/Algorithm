interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        String n = v.next(); // B진법 수
        int b = v.nextInt(); // B진법

        int result = 0; // 결과값
        int digit = 0; // 자릿수

        for (int i = n.length() - 1; i >= 0; i--) {
            int temp = n.charAt(i) - 48;
            if (temp > 9) {
                temp -= 7;
            }
            result += temp * Math.pow(b, digit);
            digit++;
        }

        System.out.println(result);
    }
}