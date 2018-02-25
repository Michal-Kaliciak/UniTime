public class CashRegisterNelson
{
    //private data
    private int itemCount;
    private double totalPrice;
    
    //methods (public interface)
    public void addItem(double price)
    {
        itemCount++;
        totalPrice+=price;
    }
    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
    }
    public double getTotal()
    {
        return totalPrice;
    }
    public int getCount()
    {
        return itemCount;
    }
    /* constructor */
    public CashRegisterNelson()
    {
    itemCount = 0;
    totalPrice = 0;
    }
} // end of class CashRegister
