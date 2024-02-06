interface Main {
    static void main (String[] s) {
        var v = new java.util.Scanner(System.in);
        int N = v.nextInt();
        int[] arr = new int[N];
        int M = v.nextInt();

        for(int i = 0; i < M; i++) {
            int I = v.nextInt();
            int J = v.nextInt();
            int K = v.nextInt();

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}