import java.util.Scanner;

public class CashRegisterNelsonTest
{
    public static void main(String[ ] args)
    {
        Scanner input = new Scanner(System.in);
        CashRegisterNelson reg1 = new CashRegisterNelson();
        System.out.println("Reg1 Enter a price for 1st item: ");
        double price = input.nextDouble();
        reg1.addItem(price);
        System.out.println("Enter a price for 2nd item: ");
        price = input.nextDouble();
        reg1.addItem(price);
        System.out.println("Total cost is £ " + reg1.getTotal() +
        " and number of items bought is " + reg1.getCount());
        
        /* 2nd instances of CashRegister */
   /*            
       CashRegister reg2 = new CashRegister();
        System.out.println("Enter a price for 1st item: ");
        price = input.nextDouble();
        reg1.addItem(price);
        System.out.println("Enter a price for 2nd item: ");
        price = input.nextDouble();
        reg1.addItem(price);
        System.out.println("Total cost is " + reg1.getTotal() +
        " and number of items bought is " + reg1.getCount());
               
        /* 3rd instances of CashRegister */
             
   /*    CashRegister reg3 = new CashRegister();
        System.out.println("Enter a price for 1st item: ");
        price = input.nextDouble();
        reg1.addItem(price);
        System.out.println("Enter a price for 2nd item: ");
        price = input.nextDouble();
        reg1.addItem(price);
        System.out.println("Total cost is " + reg1.getTotal() +
        " and number of items bought is " + reg1.getCount()); */
    }
} // end of class CashRegisterTest