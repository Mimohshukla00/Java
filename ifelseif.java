import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if (a==b) {
            System.out.println("a and b are equal");
            
        
        
            
        }
        else if(a<b){
            System.out.println("a is smaller than b");
        }
        else {
            System.out.println("number a is grater than b ");
        }
    }
    
}
