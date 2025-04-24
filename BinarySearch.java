import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println(key + " found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println(key + " not found in the array.");
        }
    }
}
/*
 Output
 Enter the number to search: 40
40 found at index 3
 */