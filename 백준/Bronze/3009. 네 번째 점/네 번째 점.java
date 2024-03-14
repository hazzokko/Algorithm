interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int x = 1, y = 1;
        int[] arrX = new int[3];
        int[] arrY = new int[3];

        for (int i = 0; i < 3; i++) {
            arrX[i] = v.nextInt();
            arrY[i] = v.nextInt();
        }

        if (arrX[0] == arrX[1]) {
            x = arrX[2];
        } else if (arrX[0] == arrX[2]){
            x = arrX[1];
        } else {
            x = arrX[0];
        }

        if (arrY[0] == arrY[1]) {
            y = arrY[2];
        } else if (arrY[0] == arrY[2]){
            y = arrY[1];
        } else {
            y = arrY[0];
        }

        System.out.println(x + " " + y);
    }
}