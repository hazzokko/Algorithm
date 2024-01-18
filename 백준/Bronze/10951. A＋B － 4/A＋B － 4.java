interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        while (v.hasNext()) System.out.println(v.nextInt() + v.nextInt());
    }
}