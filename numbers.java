
public class numbers
{

    public static void main (String[] args)
    {
        String s0 = "0";
        String s1 = "1";
        for(int k =2; k<=9; k++){
            String s = s0;
            if(k%2 ==1)
                s=s1;
            System.out.println( k +"is:" + s);
        }
    }
}
