public class Sorting {

    public static void main(String[] args) {
        int[] unsorted = new int[] { 2, 4, 66, 43, 6, 2, 9, 24, 53, 1, 22 };
        // int[] sorted = SelectionSort(unsorted);
        // int[] sorted = bubbleSort(unsorted);
        int[] sorted = insertionSort(unsorted);
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

    public static int[] bubbleSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (array[j] > current && j >= 0) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = current;
        }
        return array;
    }
}
