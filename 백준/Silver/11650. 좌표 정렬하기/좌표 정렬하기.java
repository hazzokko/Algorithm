import java.util.*;

interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        int num = v.nextInt(); // 점의 개수

        int[][] arr = new int[num][2]; // 좌표를 저장할 2차원 배열
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = v.nextInt();
            }
        }

        // x좌표의 값이 다르면 x좌표를 기준으로 오름차순, x좌표의 값이 같으면 y좌표를 기준으로 오름차순
        Arrays.sort(arr, (o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]);

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}