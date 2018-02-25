import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercise

{
    public static void main(String[] args)
    
    {
        //declare array, Scanner Object and array
        int input, result;
        final int SIZE = 5;
        Scanner scan = new Scanner(System.in);
        int[] anArray = new int[SIZE];
        //create loop to get user input
        for(int i = 0; i< anArray.length; i++)
        {
            System.out.print("please enter whole number "+(i+1)+ " : "); //have to be in the brackets otherwise will be string concatination 
            input = scan.nextInt();
            //asign value to array at index i
            anArray[i] = input;
        }
        
        //print user entries in array using helper method
        printArrayElements("you entered the following numbers: ", anArray);
        //call ArraySum and store returned vale
        result = arraySum(anArray);
        //print result to terminal =cant use help as type is int not array
        System.out.println("The result of arraySum method is : " +result);
    
    }
    //Helper method printArrayElements takes in String value and stored it in varable message
    //and the values of an array and stores them in the array incomingArray
    //the method prints the array values out as a String
    
    
    public static void printArrayElements(String message, int[] incomingArray)
    {
        System.out.println(message + " " + Arrays.toString(incomingArray));
    }
    
    //method arraySum recieves values from an array and puts them into incomingArray array
    //the method adds the values from each elements together and returns the result
    
    public static int arraySum(int[] incomingArray)
    {
        int sum = 0;
        for(int i = 0; i < incomingArray.length; i++)
        {
            //sum=sum +incomingArray[i]
        sum += incomingArray[i];
        
        }
        return sum;
    }

}