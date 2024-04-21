interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        int num = v.nextInt();
        int[][] arr = new int[101][101];
        int area = 0;

        for (int i = 0; i < num; i++) {
            int x = v.nextInt();
            int y = v.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (arr[j][k] != 1) {
                        arr[j][k] = 1;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}