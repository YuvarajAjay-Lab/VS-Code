public class LargestElementOfArray 
{
    public static void main(String[] args)
    {
        int array[] = {1,3,15,-77,-9,-11};
        int largest = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > largest)
                largest = array[i];
            System.out.println(largest);
        }
        System.out.println("The largest element in the array : " +largest);
    }
}