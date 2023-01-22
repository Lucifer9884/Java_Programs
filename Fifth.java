import java.util.Scanner;

public class Fifth {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter The First Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter The Second Number: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("Largest Number Is: " +num1);
        }
        else if (num1 < num2) {
            System.out.println("Largest Number Is: " +num2);
        }
        else{
            System.out.println("Numbers Are Equal!!");
        }
    }
}
