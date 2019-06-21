import java.util.Scanner;
public class CheckValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String input_name = scanner.nextLine();
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i]==input_name) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + input_name + " in the list.");

    }
}
