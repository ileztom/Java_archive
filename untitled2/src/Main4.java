public class Main4 {
    public static void main(String[] args){
        int i = 0;
        while (i<= 15) {
            System.out.println(fibonachi(++i));
        }
    }
    static int fibonachi(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        else {
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }
}
