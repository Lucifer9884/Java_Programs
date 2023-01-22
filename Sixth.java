import java.util.Scanner;

public class Sixth {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("How Much Rupees You Want To Convert: ");
        float rup = input.nextFloat();

        // If Doller Value Was Changed Then Uncomment Below Code
        // System.out.print("Enter Present Doller Value In Rupees: ");
        // float usdp = input.nextFloat();

        float usdp = 79.65f;

        float usd = rup / usdp;

        System.out.println("Your Collection In Doller Is: " +usd);
    }
}
