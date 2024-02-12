import java.util.Scanner;

public class functions {
    public static void printName(String name){
        System.out.println(name);
        return;

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name=input.next();
        printName(name);

        
    }
}
