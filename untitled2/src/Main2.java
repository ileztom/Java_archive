public class Main2 {
    public static void main(String[] args){
        int[][] b = {{5, 3, 7, 13}, {7, 8, 1, 12}, {8, 1, 2, 3}};

        System.out.println(b.length);
        System.out.println(b[0].length);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
