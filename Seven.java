import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t1 = 0, t2 = 1, t3, i;
        System.out.print("Enter The Number Of Terms: ");
        int n = input.nextInt();
        System.out.print(t1 +" "+ t2);
           
        for(i = 2; i < n; i++)    
        {    
         t3 = t1 + t2;    
         System.out.print(" "+ t3);    
         t1 = t2;    
         t2 = t3;    
        } 
    }
}
