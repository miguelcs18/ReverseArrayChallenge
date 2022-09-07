import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array)
    {
        int temp;
        for(int i=0; i<array.length; i++)
        {
            temp = array[i];
            array[i] = array[array.length-1];
            array[array.length-1]=temp;
        }
    }
}
