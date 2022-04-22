import java.lang.Math;
import java.util.Arrays;
public class numSysConvertion {
    
    public static void main(String[] args) {
        //convert binary to decimal and vice versa

        binaryToDecimal(10011);
        decimalToBinary(2147);

    }

    public static void binaryToDecimal(int binary){
        int sum = 0;
        int pow = 0;
        while(binary > 0){
            sum += binary%10 * Math.pow(2, pow);
            binary /= 10;
            ++pow;
        }
        System.out.println(sum);
    }

    public static void decimalToBinary(int decimal){
        System.out.println("The binary value of " + decimal + " is ");
        int[] array = new int[31];
        int i = 0;
        while(decimal > 0){
           
            array[i] = decimal%2;
            decimal /= 2;
            ++i;
        }
       for(int j = 30 ; j >=0 ; j--){
           System.out.print(array[j]);
       }

       System.out.println();
    }

}
