import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the name:");
        String str = scan.nextLine();
        scan.close();
        //String str = "gokul";
        int length = str.length();
        char array[] = new char[length];

        for(int i = length - 1; i >= 0; i--){
            array[i] = str.charAt(i);
            System.out.print(array[i]);
        }
                
    }
}
