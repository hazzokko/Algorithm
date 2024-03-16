interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).nextLine();
        char[] arr = v.toUpperCase().toCharArray();
        int[] count = new int[26];
        int max = 0;
        char result = 0;
        
        for (char c : arr) {
            count[c - 'A']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) ('A' + i);
            } else if (count[i] == max) {
                result = '?';
            }
        }
        
        System.out.println(result);
    }
}