import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int principle = scan.nextInt();
        System.out.print("Rate of Interest : ");
        float r = scan.nextFloat();
        System.out.print("No of months: ");
        float time = scan.nextFloat();
        scan.close();

        float simpleInterest = (principle * r * (time/12)) /100;
        //System.out.println(r);
        System.out.println(simpleInterest);
    }
    
}
