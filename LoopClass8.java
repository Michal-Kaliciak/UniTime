
public class LoopClass8
{
  public static void main (String[] args)
    {
//         for (int r = 8; r>=1; r--){
//         
//             for(char c='a'; c <= 'h'; c++)
//             
//             System.out.print(" "+ c + r +" ");
//             System.out.println();       


    int[] data={2,3,5,7,11};
    for(int i=0;i<data.length /2; i++){
    data[data.length -1 -i] = data[i];
    System.out.print(data[i]);

        }

    }

}