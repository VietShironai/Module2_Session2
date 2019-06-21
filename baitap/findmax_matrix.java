import java.util.Scanner;

public class findmax_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap row ");
        int row = sc.nextInt();
        System.out.println("nhap collum");
        int collum = sc.nextInt();
        int[][] array = new int[row][collum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("gia tri max la: ");
        FIndmax(array);
    }

    private static void FIndmax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max)
                    max = array[i][j];
            }
        }
        System.out.println(max);
    }
}
