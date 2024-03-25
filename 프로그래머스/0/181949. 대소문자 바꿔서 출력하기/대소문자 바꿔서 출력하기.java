import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        var v = new java.util.Scanner(System.in).next();
        String result = "";
        for (int i = 0; i < v.length(); i++) {
            if (65 <= v.charAt(i) && v.charAt(i) <= 90) {
                result += String.valueOf(v.charAt(i)).toLowerCase();
            } else if (97 <= v.charAt(i) && v.charAt(i) <= 122) {
                result += String.valueOf(v.charAt(i)).toUpperCase();
            }
        }
        System.out.println(result);
    }
}