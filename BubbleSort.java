import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[1000000];
        Random rnd = new Random();
        for (int x = 0; x < array.length; x++){
            array[x] = rnd.nextInt(999);

            for (int i = array.length-1; i >=0; i-- ){
                for (int j = 0; j < i; j++){
                    if (array[j]>array[j+1]){
                        int c = array[j];
                        array[j] = array[j + 1];
                        array[j+1] = c;
                    }

                }
            }


        }
        System.out.println(Arrays.toString(array));

        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
