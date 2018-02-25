import java.util.Arrays;

public class ReversArrays {
    
    public static void main (String[] args){
    int[] data = new int[] {1,4,9,16,9};
    int [] data1 = reverseArray(data);
    printArrayElement(data);
    printArrayElement(data1);

     
}
   

 public static void printArrayElement (int[] arrayToPrint)
    {
    System.out.println(Arrays.toString(arrayToPrint));
    }
   
    
    public static int[] reverseArray (int[] data) {
        
        int[] reverse = new int[data.length];
        
        for (int i = data.length - 1 ; i > -1; i--){
        reverse[data.length - i - 1] = data[i];
        }
        return reverse;
    
    
    }
}