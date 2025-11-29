public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println("Values of A : " + a +" & B : "+ b + " before swap");

        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Values of A : " + a +" & B : "+ b + " after swap");

    }    
}
