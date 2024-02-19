interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).nextLine();
        String[] str = v.trim().split(" ");
        if (str.length == 1 && str[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(str.length);
        }
    }
}