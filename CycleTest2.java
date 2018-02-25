/**
 * CycleTest - Boris Bikes .
 * 
 * @author Michal Kaliciak
 *
 */
import java.util.Scanner;
import java.util.Random;

public class CycleTest2
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       Cycle user1 = new Cycle();
       Cycle user2 = new Cycle();
       Cycle user3 = new Cycle();

       Random rand = new Random();
       int minNum=rand.nextInt(11);
       
       //System.out.println("input lowest number :");
       //int minNum=rand.nextInt();
       //System.out.println("input max number :"); 
        //int maxNum=rand.nextInt();
        //System.out.println((Match.random()(maxNum-minNum+minNum));
       
       //System.out.println("Please enter docking No. for cycle :" + user1.getID());
       System.out.println("Random docking number  :" + user1.getRandomNumber());
       //int one = in.nextInt();
       int one = rand.nextInt(11);
       //System.out.println("Please enter docking No. for cycle :" + user2.getID());
       System.out.println("Random docking number  :" + user2.getRandomNumber());
       //int two = in.nextInt();
       int two = rand.nextInt(11);
       //System.out.println("Please enter docking No. for cycle :" + user3.getID());
       System.out.println("Random docking number  :" + user3.getRandomNumber());
       //int three = in.nextInt();
       int three = rand.nextInt(11);
      
       if(user1.park(one) == true)
       {
           //System.out.println("Cycle with ID " + user1.getID() + user1.getDockingStationNo());
           System.out.println("Cycle with ID " + user1.getRandomNumber() + user1.getDockingStationNo());
       }
       else
       //System.out.println("Cycle with ID " + user1.getID() + user1.getDockingStationNo());
       System.out.println("Cycle with ID " + user1.getID() + user1.getDockingStationNo());
       
       if(user2.park(two) == true)
       {
           System.out.println("Cycle with ID " + user2.getID() + user2.getDockingStationNo());
           //System.out.println("Cycle with ID " + user2.getID() + user2.getDockingStationNo());
       }
       else
            //System.out.println("Cycle with ID " + user2.getID() + user2.getDockingStationNo());
            System.out.println("Cycle with ID " + user2.getID() + user2.getDockingStationNo());
       if(user3.park(three) == true)
       {
           //System.out.println("Cycle with ID " + user3.getID() + user3.getDockingStationNo());
          System.out.println("Cycle with ID " + user3.getID() + user3.getDockingStationNo());
       }
       else
          //System.out.println("Cycle with ID " + user3.getID() + user3.getDockingStationNo());
           System.out.println("Cycle with ID"+ user3.getID()+user3.getDockingStationNo());
      
       /*if (user3.pickup() == true)
       {
        System.out.println("Cycle 3 is in use " );
        }
       */
      
       System.out.println("Number of cycles currently in the system: " + Cycle.getNumberOfCycles());
   
    
    }
}