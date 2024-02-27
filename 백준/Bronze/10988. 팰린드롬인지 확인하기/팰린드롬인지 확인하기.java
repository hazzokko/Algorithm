interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).nextLine();
        String str = "";
        for (int i = v.length() - 1; i >= 0; i--) {
            str += v.charAt(i);
        }
        if (v.equals(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}