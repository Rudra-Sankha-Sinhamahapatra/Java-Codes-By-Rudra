 import java.util.Scanner;
public class pr2 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array with the given size
        int[] nums = new int[size];

        // Get the array elements from the user
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Get the target value from the user
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Call the linearSearch method
        int index = linearSearch(nums, target);

        // Print the result
        if (index != -1) {
            System.out.println(target + " found at index " + index + " in the array.");
        } else {
            System.out.println(target + " not found in the array.");
        }
        scanner.close();
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}


