interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        System.out.println(v.nextLine().charAt(v.nextInt() - 1));
    }
}