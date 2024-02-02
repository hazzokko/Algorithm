interface Main {
    static void main (String[] s) {
        var v = new java.util.Scanner(System.in);
        int a = v.nextInt();
        int b = v.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
                if (count == b) {
                    System.out.println(i);
                }
            }
        }
        if (count < b) System.out.println(0);
    }
}