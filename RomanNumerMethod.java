import java.util.Scanner;

public class RomanNumerMethod
{
    public static void main (String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter a number to convert to roman numerial: ");
     String result = input(in.nextInt());   
     System.out.println(result);
     
     }
    public static String romanDigit(int n, String one, String five, String ten)
    {
        if(n == 1)
        {
         return one;   
        }
        if(n == 2)
        {
        return one + one;
        }
        if(n == 3)
        {
        return one + one + one;
        }
        if(n == 4)
        {
        return one + five;
        }
        if(n == 5)
        {
        return five;
        }
        if(n == 6)
        {
        return five + one;
        }
        if(n == 7)
        {
        return five + one + one;
        }
        if(n == 8)
        {
        return five + one + one + one;
        }
        if(n == 9)
        {
        return one + ten;
        }
        return " ";
        }
    
        public static String input(int n)
      {
       String romanUnits = romanDigit(n % 10, "I", "V", "X"); 
       n = n/10;
       String romanTens = romanDigit(n % 10, "X", "L", "C");
       n = n/10;
       String romanHundreds = romanDigit(n % 10, "C", "D", "M");
       n = n/10;
       String romanThousands = romanDigit(n % 10, "M", "M", "M");
       n = n/10;
       return romanThousands+romanHundreds+romanTens+romanUnits; 

   }
}


/* if(number < 1 || number > 3999)
        {
            System.out.println("Invalid number to covert.");
        }
        
        
        L(50) C(100) D(500) M(1000)
        
        */
       
       
 