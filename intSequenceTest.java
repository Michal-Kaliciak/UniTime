import java.util.Scanner;

public class intSequenceTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        intSequence test = new intSequence();
        int user = 1; 

        while(user != 0 )
        {
            System.out.println("Please enter integer (whole numbers only, input 0 to finish) : ");
            user = in.nextInt();
            if(user >0)
            {    
                test.nextScore(user);
                test.smallScore(user);
                test.largeScore(user);
            }
        }
        {
            System.out.println("The number of values entered is: " + test.getCount ());
            System.out.println("The largest value is : " + test.largeScoreLarge());
            System.out.println("The smallest value is : " + test.smallScoreSmall());
            System.out.println("The average of the values is : " + test.averageScore());
            System.out.println("The Range is: " + test.range());
        } 
    }

}