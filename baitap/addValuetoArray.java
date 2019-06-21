import java.util.Scanner;

public class addValuetoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = sc.nextInt();
        System.out.println("Nhap index: ");
        int index = sc.nextInt();
        int[] array = new int[20];
        for (int i = 0; i < array.length;i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]+" ");
        }
        System.out.println("ket qua la");
        Print(Addvalue(array,index,number));;
    }

    private static int[] Addvalue(int[] array, int index,int number) {
        int[] newarray= new int[array.length+1];
        for (int j=0;j<index;j++){
            newarray[j]=array[j];
        }
        newarray[index]= number;
        for (int j=index+1; j< array.length+1;j++){
            newarray[j]=array[j-1];
        }
        return newarray;
    }
    private static  void Print(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
