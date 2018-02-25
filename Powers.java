public class Powers
{
    public static void main(String[] args){
        long result = 1;// we cannot start with 0 because that gonna be infinite loop (all 0 in whole loop)
        int a=2;// the power, 1*2=2, 2*2=4 and 4*2 so on...

        for(int i=0; i<=40; i++) // loop will be executed 20 
        {
            System.out.println(result);
            result  = result * a;    //store result*a in the left side in result
        }
        }
}
