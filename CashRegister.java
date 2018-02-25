
public class CashRegister
{
    private int itemCount = 0;
    private double totalPrice = 0;

    public void addItem(double price)       //Mutator
    {
        itemCount++;
        totalPrice += price;
    }

    public void clear()                      //mutator
    {
        itemCount = 0;
        totalPrice = 0;
    }

    public double getTotal()                //Accessor
    {
        return totalPrice;          // this line we can change later to(totalPrice*10) to get price without , (page17)
    }

    public int getCount()                   //Accessor
    {
        return itemCount;
    }

    public CashRegister()                     //constructor
    {
        itemCount = 0;
        totalPrice = 0;
    }
    
}