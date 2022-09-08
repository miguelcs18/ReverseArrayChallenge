import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int [] array = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println("array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("reverse array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array)
    {
        int first;
        int last;
        for(int i=0; i<array.length/2; i++)
        {
         first = array[i];
         last = array[array.length-(i+1)];
         array[array.length-(i+1)] = first;
         array[i] = last;
        }
    }
}
