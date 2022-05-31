public class Challenges {
    public static void main(String[] args) {
        // max_till_i(new int[] { 1, 0, 5, 4, 6, 8 });
        sum_off_subarray(new int[] { 1, 2, 2 });
    }

    public static void max_till_i(int[] array) {
        // prints the max value till every index
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(max + " ");
        }
    }

    public static void sum_off_subarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                }
                System.out.println("Sum : " + sum);
                System.out.println();
            }
        }
    }
}
