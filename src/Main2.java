import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int b[][] = {{4,5,6},{7,8,9}};

        int j=0; int i=0;
        while(j<2){
            i=0;
            while(i<3) {
                System.out.print(b[j][i]+" ");
                i++;
            }
            j++;
            System.out.println();
        }
    }
}
