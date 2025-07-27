import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int linearResult = linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found.");
        }
        Arrays.sort(array);
        System.out.println("Sorted array for Binary Search: " + Arrays.toString(array));
        int binaryResult = binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found.");
        }

        scanner.close();
    }

    // Linear Search Implementation
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1;
    }

    // Binary Search Implementation
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] > target) {
                right = mid - 1;
            }
           
            else {
                left = mid + 1;
            }
        }
        return -1; 
    }
}
