import java.util.Scanner;

public class VowelOfString {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = scan.nextLine();
        //int length = str.length();
        scan.close();
        
        int vowelCount =0;
            
        char vowel[] ={'a','e','i','o','u','A','E','I','O','U'};
        // int arrayLength = vowel.length;

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < vowel.length; j++){
                if (str.charAt(i)==vowel[j]){
                    vowelCount += 1;
                    break;
                }
            }
        }
        System.out.println("No of vowel : " + vowelCount);
        System.out.println("No of consonents : " + (str.length() - vowelCount));
    }
    
}
