/**
 * CycleTest - Boris Bikes .
 * 
 * @author Michal Kaliciak
 *
 */
import java.util.Scanner;
import java.util.Random;

public class CycleTest
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       Cycle user1 = new Cycle();
       Cycle user2 = new Cycle();
       Cycle user3 = new Cycle();

       
       //int minNum=rand.nextInt(11);
      
       //System.out.println("input lowest number :");
       //int minNum=rand.nextInt();
       //System.out.println("input max number :"); 
       
       
       System.out.println("Please enter docking No. for cycle :" + user1.getID());
       //System.out.println("Random docking number  :" + user1.getRandomNumber());
       int one = Cycle.randomNumber(1,10);
       //int one = rand.nextInt(11);
       System.out.println("Please enter docking No. for cycle :" + user2.getID());
       //System.out.println("Random docking number  :" + user3.getRandomNumber());
       int two = Cycle.randomNumber(1,10);
       //int two = rand.nextInt(11);
       System.out.println("Please enter docking No. for cycle :" + user3.getID());
       //System.out.println("Random docking number  :" + user3.getRandomNumber());
       int three = Cycle.randomNumber(1,10);
       //int three = rand.nextInt(11);
      
       if(user1.park(one) == true)
       {
           System.out.println("Cycle with ID " + user1.getID() + user1.getDockingStationNo());
          
           //System.out.println("Cycle with ID " + user1.getRandomNumber() + user1.getDockingStationNo());
       }
       else
       System.out.println("Cycle with ID " + user1.getID() + user1.getDockingStationNo());
       
       //System.out.println("Cycle with ID " + user1.getRandomNumber() + user1.getDockingStationNo());
       
       if(user2.park(two) == true)
       {
           //System.out.println("Cycle with ID " + user2.getRandomNumber() + user2.getDockingStationNo());
           System.out.println("Cycle with ID " + user2.getID() + user2.getDockingStationNo());
       
        }
       else
            System.out.println("Cycle with ID " + user2.getID() + user2.getDockingStationNo());
       
            //      System.out.println("Cycle with ID " + user2.getRandomNumber() + user2.getDockingStationNo());
       
            if(user3.park(three) == true)
       {
           System.out.println("Cycle with ID " + user3.getID() + user3.getDockingStationNo());
          
           // System.out.println("Cycle with ID " + user3.getRandomNumber() + user3.getDockingStationNo());
       }
       else
       System.out.println("Cycle with ID " + user3.getID() + user3.getDockingStationNo());
       
       //System.out.println("Cycle with ID"+user3.getRandomNumber()+user3.getDockingStationNo());
      
       
      
       System.out.println("Number of cycles currently in the system: " + Cycle.getNumberOfCycles());
       
       
   
    
    }
}




   //Cycle user4 = new Cycle();
       //Cycle user5 = new Cycle();


 /*System.out.println("Please enter the value for cycle "+user4.getID());
       int four = in.nextInt();
       System.out.println("Please enter the value for cycle "+user5.getID());
       int five = in.nextInt();**/


/*
       if(user2.park(four) == true)
       {
           System.out.println("Cycle ID "+user4.getID() + user4.getDockingStationNo());;
       }
       else
       System.out.println("Cycle "+user4.getID()+user4.getDockingStationNo() );
       
       if(user2.park(five) == true)
       {
           System.out.println("Cycle ID "+user5.getID() + user5.getDockingStationNo());;
       }
       else
       System.out.println("Cycle "+user5.getID()+user5.getDockingStationNo() );
       */
      
      /*   private int i = 1;
    private static int v = 2;
    public T09() {
        System.out.println("constructor of T09: i = " + i + ", v = " + v);
        i = 0;
        v++;
    }
    public static void main(String[] args) {
        T09 t1 = new T09();
        System.out.println("t1: i = " + t1.i + ", v = " + t1.v);
        t1.v = 7;
        T09 t2 = new T09();
        System.out.println("t2: i = " + t2.i + ", v = " + t2.v);
        t1.v = 5;
        System.out.println("t2: i = " + t2.i + ", v = " + t2.v);
    }
}*/