public class pattern9 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            //for spacing
            for (int j = 0; j <n-i+1; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
                
            }
            for (int j = 0; j <n-i+1; j++) {
                System.out.print(" ");
                
            }System.out.println();
        }
        // System.out.println();

        int m =4;
        for (int i = 0; i < m; i++) {
            //spacing loop
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                
            }
            // for star 
            for (int j = 0; j <2*m-(2*i+1); j++) {
                // System.out.print(" ");
                System.out.print("*");
                
            }
            // for space 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                
            }
            System.out.println();

    
}
        
    }

    
}
