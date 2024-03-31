interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        String[][] arr = new String[5][15];
        String result = "";

        for (int i = 0; i < 5; i++) {
            String s = v.nextLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != null) {
                    result += arr[i][j];
                }
            }
        }

        System.out.println(result);
    }
}