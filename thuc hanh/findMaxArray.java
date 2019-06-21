import java.util.Scanner;

public class findMaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            array[i] = (int) (Math.random() * 100);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        findMax(array);
    }

    public static void findMax(int[] array) {
        int max = array[0];
        int index = 0;

        for (int m = 1; m < array.length; m++) {
            if (array[m] > max) {
                max = array[m];
                index= m;

            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index); }
    }
