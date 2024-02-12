import java.util.Scanner;

public class sumfunctions {
   public sumfunctions() {
   }

   public static int calculateSum(int var0, int var1) {
      return var0 + var1;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter first number:");
      int var2 = var1.nextInt();
      System.out.println("Enter a second number:");
      int var3 = var1.nextInt();
      int var4 = calculateSum(var2, var3);
      System.out.println(var4);
   }
}
