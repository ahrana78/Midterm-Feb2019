package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */
        int x;
        for(int i=0;i<10;i++) {
            for( x = 9; x>= i; x--){
                System.out.print(" ");
            }
            for( x=0; x<=i;x++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}