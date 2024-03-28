interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        int N = v.nextInt(), M = v.nextInt();
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = v.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] += v.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}