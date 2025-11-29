public class Factorial {
    public static void main(String[] args) {

        
        int number = 5;
        int result = 1;
        
        for(int i = 1; i <= number; i++) {
            result = result * i;
            //System.out.println("The factorial of " + i + " : " + result);
        }
        System.out.println("The factorial of "+ number + " : " +result);
    }

    static int factorial(int a){
        return a * factorial(a -1);
    }
}
