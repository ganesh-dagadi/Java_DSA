public class Sorting {

    public static void main(String[] args) {
        int[] unsorted = new int[] { 2, 4, 66, 43, 6, 2, 9, 24, 53, 1, 22 };
        int[] sorted = SelectionSort(unsorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    public static int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
