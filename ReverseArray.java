import java.util.*;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:-  ");
        int size = sc.nextInt();
        int Array[] = new int[size];
        System.out.println("Enter the Array Element:- ");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("The Reverse Array is:- ");
        for (int i = size-1; i >= 0; i--) {
        System.out.print(" "+Array[i]);
        }
    }
}
/*output
Enter the size of Array:-  
3
Enter the Array Element:- 
12 13 14
The Reverse Array is:- 
 14 13 12
 */