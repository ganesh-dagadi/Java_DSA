import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        printRhombus();
        printTriangle();
    }

    private static void printRhombus(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Print rhombus");
        int row;
        System.out.println("Enter the number of rows needed : ");
        row = sc.nextInt() + 1; //i runs row-1 times. to componsate, we add 1 to input rows.
        int num_cols = row + (row-1);

        for(int i = row-1; i >= 0 ; i--){
            for(int j = 0 ; j<=num_cols ; j++){
                if(j <= i) System.out.print(' ');
                else System.out.print('*');
            }
            num_cols--;
            System.out.println();
            if(num_cols == row) return;
        }
    }

    private static void printTriangle(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Print triangle");
        int row;
        System.out.println("Enter the number of rows needed : ");
        row = sc.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= row-i ; j++){
                System.out.print(' ');
            }
            for(int j = 0; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
