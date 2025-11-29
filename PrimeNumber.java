import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int j=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        scan.close();
        
        for(int i= 1;i <= number; i++){
            if(number%i==0)
                j = j+1;  
        }
        //System.out.println(j);
        if(j==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
               
    }
      
}
