
public class CashRegisterInt
{
    private int itemCount = 0;
    private int totalPrice = 0;
    private double totalCorrect = 0;

    public void addItem(double price)       //Mutator
    {
        itemCount++;
        totalPrice += price*100;
        //totalCorrect += price;
    }

    public void clear()                      //mutator
    {
        itemCount = 0;
        totalPrice = 0;
        totalCorrect = 0;
    }

    public double getTotal()                //Accessor
    {
        return (double)(totalPrice/100);          // this line we can change later to(totalPrice*10) to get price without , (page17)
    }
    
    public double getTotalCorrect() 
    {
    return totalCorrect;   
    }
    
    public int getCount()                   //Accessor
    {
        return itemCount;
    }

    public CashRegisterInt()                     //constructor
    {
        itemCount = 0;
        totalPrice = 0;
        totalCorrect = 0;
    }
    
}