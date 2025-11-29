public class SumOfArray {
    public static void main(String[] args) {
        int array[] = {1,3,5,7,9};
        int sumOfArray = 0;
        for(int i=0; i < array.length; i++){
            sumOfArray = sumOfArray + array[i];
            System.out.println(sumOfArray);
        }
        System.out.println("The sum of array elements : " + sumOfArray);
    }
}
