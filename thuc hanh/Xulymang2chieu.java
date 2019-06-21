import java.util.Scanner;

public class Xulymang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap collum");
        int collum = sc.nextInt();
        System.out.println("nhap row ");
        int row = sc.nextInt();
        int[][] matrix;
        matrix = new int[row][collum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + " ");
            }
                System.out.println();

        }

//        for ( row = 0; row < matrix.length; row++) {
//            for (collum = 0; collum < matrix[row].length; collum++) {
//                System.out.print(matrix[row][collum] + " ");
//            }
//        }
//        System.out.println();
    }
}
