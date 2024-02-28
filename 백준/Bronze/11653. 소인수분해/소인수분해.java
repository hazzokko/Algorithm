interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).nextInt();
        for (int i = 2; i <= Math.sqrt(v); i++) {
            while (v % i == 0) {
                System.out.println(i);
                v /= i;
            }
        }
        if (v != 1) {
            System.out.println(v);
        }
    }
}