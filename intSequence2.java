import java.util.Scanner;

public class intSequence2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int count = 1; 
        int no1 =1;
        int larg = 0;
        int small = no1;
        double average = 0;

        while(no1 != 0 )
        {
            System.out.println("Please enter integer (whole numbers only)" + count +  ": ");
            no1 = scan.nextInt();
            average= average + no1;

            if(count == 1)
            {    
                larg = no1;
                small = no1;
            }
            if(no1>larg){
                larg=no1;
            }
            if (small > no1 && no1>0) {
                small = no1;
            }    
            count++;

        }

        int value = count -2;
        average = average /value;
        int range = larg - small;

        System.out.println("The number of values entered is: " + value);
        System.out.println("The largest value is : " + larg);
        System.out.println("The smallest value is : " + small);
        System.out.println("The average of the values is : " + average);
        System.out.println("The Range is: " + range);

    }
    
}
    
    
    