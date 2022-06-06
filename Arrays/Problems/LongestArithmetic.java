package Problems;

import java.util.Scanner;

public class LongestArithmetic {
    // Driver function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTest = sc.nextInt();
        for (int test = 1; test <= numOfTest; test++) {
            int numElements = sc.nextInt();
            int[] array = new int[numElements];
            for (int i = 0; i < numElements; i++) {
                int element = Integer.parseInt(sc.next());
                array[i] = element;
            }
            int longest = FindLongestArithmetic(array);
            System.out.println("Case #" + test + ": " + longest);
        }
    }

    private static int FindLongestArithmetic(int[] array) {
        int maxLen = 1;
        int currentLen = 1;
        int currentDiff = array[0] - array[1]; // 9 5 3 2 3 5 7 5 4 4 4 7 2 2 2 2 4 4
        boolean first = true;
        for (int i = 1; i < array.length - 1; i++) {
            int indexDiff = array[i] - array[i + 1];
            if (indexDiff == currentDiff) {
                if (first) {
                    currentLen += 1;
                    first = false;
                }
                currentLen += 1;
            } else {
                if (maxLen < currentLen) {
                    maxLen = currentLen;
                }
                currentLen = 1;
                currentDiff = indexDiff;
                i--;
            }
        }
        if (maxLen < currentLen) {
            maxLen = currentLen;
        }
        return maxLen;
    }
}