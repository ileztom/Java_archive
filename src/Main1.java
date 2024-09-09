import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        String a = new String("Name").intern();
//        int b[] = {1, 2, 3};
//        int c[][] = {{1, 2, 3}, {6, 7, 8}};
        int[][] b = new int[2][3];

        for(int j=0; j<2;j++) {
            for( int i = 0; i<3; i++) {
                Scanner scaner = new Scanner(System.in);
                System.out.println("Введите число");
                b[j][i] = scaner.nextInt();
            }
        }
        for(int j=0; j<2;j++) {
            for( int i = 0; i<3; i++) {
                System.out.print(b[j][i]+" ");
            }
            System.out.println();
        }
    }
}
