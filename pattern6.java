import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(i);
                
            }System.out.println();
            
        }
    }
    
}
