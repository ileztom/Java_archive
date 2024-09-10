public class Main {
    public static void main(String[] args){
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break");
                    if(t) {
                        break second;
                    }
                    System.out.println(" 1 ");
                }
                System.out.println(" 2 ");
            }
            System.out.println(" 3 ");
        }
    }
}