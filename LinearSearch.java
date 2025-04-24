import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 30, 45, 50 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " not found in the array.");
        }
    }
}
/*
 Output
 Enter the number to search: 25
25 found at index 1
 */