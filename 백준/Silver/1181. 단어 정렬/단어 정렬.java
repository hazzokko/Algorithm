import java.util.Arrays;
import java.util.Comparator;

interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        int num = v.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = v.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });

        Arrays.stream(arr).distinct().forEach(System.out::println);
    }
}