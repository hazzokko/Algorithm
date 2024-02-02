interface Main {
    static void main (String[] s) {
        var v = new java.util.Scanner(System.in);
        while(v.hasNext()) {
            int a = v.nextInt();
            int b = v.nextInt();
            if (a == 0 && b ==0) {
                break;
            } else if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}