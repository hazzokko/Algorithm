interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int n = v.nextInt();
        for (int i = 0; i < n; i++) {
            String str = v.next();
            System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
        }
    }
}