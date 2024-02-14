interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int cases = Integer.parseInt(v.nextLine());
        for (int t = 0; t < cases; t++) {
            String[] input = v.nextLine().split(" ");
            int num = Integer.parseInt(input[0]);
            String str = input[1];
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}