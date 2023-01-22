import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter (1, 2, 3, 4) = (=, -, *, /): ");
        int opr = input.nextInt();

        if (opr == 1) {
            System.out.println(num1 + num2);
        }
        else if (opr == 2) {
            System.out.println(num1 - num2);
        }
        else if (opr == 3) {
            System.out.println(num1 * num2);
        }
        else if (opr == 4) {
            System.out.println(num1 / num2);
        }
    }
}
