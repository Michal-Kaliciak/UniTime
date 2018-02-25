import java.util.Random;
/**
 * CycleTest.
 * 
 * @author Michal Kaliciak
 * 
 */
import java.util.*;

public class Cycle
{

    private int ID;                  //instance variable
    private int dockingStation;         //instance variable
    private static int lastAssignedNumber = 0; //class variable

    
    public int getID() //Accessor
    {
        return ID;
    }

    public boolean pickup() //Accessor
    {
        if(dockingStation!= 0)
        {
            dockingStation = 0;
            return true;
        }
        else

            return false;

    }

    public boolean park(int sockSID) //Mutator
    {
        if(dockingStation == 0)
        {
            dockingStation = sockSID;
            return true;
        }
        else

            return false;        
    }

    public String getDockingStationNo() //Accessor
    {        
        if(park(dockingStation) == true)
            return " is in use ";
        else
            return " is at docking station: "+ dockingStation;
    }

    public static int getNumberOfCycles() 
    {
        return lastAssignedNumber - 0;
    }

    public Cycle() //Constructer
    {
        dockingStation = 0;
        ID = lastAssignedNumber += 1;
    }

    public static int randomNumber(int min, int max)
    {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}

      