import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int temp = in.nextInt();
        int sum = 0;
        int num = 153;
        for (temp = num; num != 0; num = num / 10) {
            int r = num % 10;
            sum = sum + (r * r * r);
        }
        if (sum == temp) {
            System.out.println(temp+" Is An Armstrong Number!!");
        }
        else{
            System.out.println(temp +" Is Not An Armstrong Number!!!");
        }
    }
}
