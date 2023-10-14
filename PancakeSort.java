import java.util.Scanner;

public class PancakeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        pancakeSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void flip(int[] arr, int index) {
        int start = 0;
        while (start < index) {
            int temp = arr[start];
            arr[start] = arr[index];
            arr[index] = temp;
            start++;
            index--;
        }
    }

    static int findMaxIndex(int[] arr, int n) {
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void pancakeSort(int[] arr) {
        int n = arr.length;
        for (int size = n; size > 1; size--) {
            int maxIndex = findMaxIndex(arr, size - 1);

            if (maxIndex != size - 1) {
                if (maxIndex != 0) {
                    flip(arr, maxIndex);
                }
                flip(arr, size - 1);
            }
        }
    }
}
