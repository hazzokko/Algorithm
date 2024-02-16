interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).next();
        String[] str = { "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] num = v.split("");
        int time = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].contains(num[i])) {
                    time += j + 2;
                }
            }
        }
        System.out.println(time);
    }
}