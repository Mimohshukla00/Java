import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age=input.nextInt();
        if (age<18) {
            System.out.println("not elgible to vote");
            
        }
        else{
            System.out.println("elgible to vote ");
        }



    }
    
}
