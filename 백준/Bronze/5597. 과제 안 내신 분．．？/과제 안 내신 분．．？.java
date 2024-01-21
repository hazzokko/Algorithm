interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = v.nextInt();
            arr[num - 1] = 1;
        }
        for (int i = 0; i < 30; i++) if (arr[i] == 0) System.out.println(i + 1);
    }
}