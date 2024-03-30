interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0, row = 1, column = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = v.nextInt();
                arr[i][j] = num;
                if (num > max) {
                    max = num;
                    row = i + 1;
                    column = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}