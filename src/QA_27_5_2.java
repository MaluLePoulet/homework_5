import java.util.Arrays;
import java.util.Scanner;

public class QA_27_5_2 {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the array with 10 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        double averageValue = 0;
        for (int i = 0; i < array.length; i++) {
            averageValue += (double) array[i] / array.length;
        }
        System.out.println("Average value of the array is: " + averageValue);

        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Maximum value of the array is: " + maxValue);
    }
}