/**
 * 
 * @author Michal Kaliciak
 * @version Feb 2017
 */


import java.util.Scanner;
public class CashRegisterTest
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        
            CashRegister reg1 = new CashRegister();
            System.out.println("Please enter three item prices: ");
            double price = in.nextDouble();
            reg1.addItem(price);
            price = in.nextDouble();
            reg1.addItem(price);
            price = in.nextDouble();
            reg1.addItem(price);
             System.out.printf("Total cost is: "+ "%1.2f", reg1.getTotal()); // to get price 125 insted of 12,50 we have to change "%1.0f", 
            System.out.println(" and number of items bought is " + reg1.getCount());
        
        
            CashRegister reg2 = new CashRegister();
            System.out.println("Please enter two item prices: ");
            price = in.nextDouble();
            reg2.addItem(price);
            price = in.nextDouble();
            reg2.addItem(price);
            System.out.printf("Total cost is: %1.2f", reg2.getTotal());
            System.out.println(" and number of items bought is " + reg2.getCount());
            
            CashRegister reg3 = new CashRegister();
            System.out.println("Please enter two item prices");
            price = in.nextDouble();
            reg3.addItem(price);
            price = in.nextDouble();
            reg3.addItem(price);
            System.out.println("Total cost is " + reg3.getTotal() + " and number of items bought is " + reg3.getCount());
        
    }
}








  
           /* 
            */