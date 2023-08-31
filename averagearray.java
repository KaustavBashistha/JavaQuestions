package array;
public class arrayAvg {
    public static void main(String[] args) {
       
        int[] myArray = {10, 20, 30, 40};

        
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum += myArray[i];
        }

       
        double average = (double) arraySum / myArray.length;

        
        System.out.println("The average of the elements is: " + average);
    }
}