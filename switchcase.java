import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    int day=input.nextInt();
    switch (day) {
        case 1:
        System.out.println("Monday");
            
            break;
        case 2:
        System.out.println("Tuesday");
            
            break;
        case 3:
        System.out.println("Wednesday");
            
            break;
        case 4:
        System.out.println("Thursday");
            
            break;
        case 5:
        System.out.println("Friday");
            
            break;
        case 6:
        System.out.println("saturday");
            
            break;
            case 7:
        System.out.println("saturday");
            
            break;
    
        default:
        System.out.println("Invalid input");
            break;
    }
    
}
}
