import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        char sw;

        System.out.println("Введите символ");
        sw = scaner.nextLine().charAt(0);

        switch (sw) {
            case 'A':
                System.out.println("Введено - A");
                break;
            case 'B':
                System.out.println("Введено - B");
                break;
            case 'C':
                System.out.println("Введено - C");
                break;
            default:
                System.out.println("Введено что-то");
        }
    }
}