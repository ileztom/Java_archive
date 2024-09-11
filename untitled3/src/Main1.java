import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner consol = new Scanner(System.in);
        String name = String.valueOf(consol.nextLine().charAt(0));
        int id = consol.nextInt();

        System.out.println(p(2));
        System.out.println(p(2,3));
        System.out.println((p(2,3,4)));
    }

    static int p(int i) {
        return i*i;
    }
    static int p(int i,int j) {
        return i*j;
    }
    static int p(int i,int j, int k) {
        return i*j*k;
    }
}