public class ReverseArray {

    public static void Reverse(int[] data, int i, int j) {
        if(i != j) {
            int temp;
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

    public static int[] reverseArray(int[] data){
        if(data.length > 1) {
            for(int i = 0; i <= (data.length/2 - 1); i++) {
                Reverse(data, i, data.length - i - 1);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] ar = { 1,4,9,16,9};
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
        reverseArray(ar);
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
    }
}