import java.util.Scanner;

public class Fibonacci {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        try{
        System.out.println("Enter the number of run: ");
        int numberOfRun = scan.nextInt();
        System.out.println("Enter the first value: ");
        int firstValue = scan.nextInt();
        System.out.println("Enter the second value: ");
        int secondValue = scan.nextInt();
        int temp;
        scan.close();
        

        for(int i = 0; i <= numberOfRun; i++) {
            temp = firstValue + secondValue;
            System.out.print(firstValue + ",");
            firstValue = secondValue;
            secondValue = temp;
            }
        }
        catch(Exception e){
            System.out.println("Give me the number and try again" + e);
        }

        }
    }

