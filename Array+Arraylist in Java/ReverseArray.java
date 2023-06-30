import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Before reversing, the array is: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reversing, the array is: " + Arrays.toString(arr));

        in.close();
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
