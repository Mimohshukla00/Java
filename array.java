public class array {
    public static void main(String[] args){
        // int[] marks = new int[1,2,3,4,5];
        int[] marks= new int[3];
        int marks1[]={10,20,30,40,50};

        for (int i = 0; i < marks1.length; i++) {
            System.out.println(marks1[i]);
        }
        System.out.println();
        marks[0]=97;
        marks[1]=88;
        marks[2]=99;
        System.out.println(marks[0]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


        
    }
    
}
