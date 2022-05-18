import java.util.Arrays;

public class Searching {
  public static void main(String[] args) {
    int[] array = new int[] { 3, 5, 6, 7, 3, 4, 6, 7, 74, 88, 9, 4, 56, 33 };
    // int index = linearSearch(array, 74);
    // int[] array = new int[] { 3, 6, 45, 54, 62, 63, 74, 88 };
    Arrays.sort(array);
    System.out.println(array[12]);
    int index = binarySearch(array, 74);
    System.out.println(index);
  }

  private static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  private static int binarySearch(int[] arr, int key) {
    // System.out.println(arr[8]);
    int start = 0;
    int end = arr.length;

    while (start <= end) {
      int mid = (end + start) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] > key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1;
  }
}
