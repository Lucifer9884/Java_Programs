import java.util.Scanner;

public class Third {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Principal Amount: ");
        float P = input.nextFloat();
        System.out.print("Enter The Time In Years: ");
        float T = input.nextFloat();
        System.out.print("Enter The Rate In %: ");
        float R = input.nextFloat();

        float SI = (P * R * T)/100;

        System.out.println("Simple Interest Is: "+SI);
    }
}
