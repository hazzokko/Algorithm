interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);

        int num = v.nextInt();
        int result = v.nextInt();
        int[] card = new int[num];
        int max = 0;

        for (int i = 0; i < num; i++) {
            card[i] = v.nextInt();
        }

        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int temp = card[i] + card[j] + card[k];
                    if (temp <= result) {
                        max = Math.max(max, temp);
                    }
                }
            }
        }

        System.out.println(max);
    }
}