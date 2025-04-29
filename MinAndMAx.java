import java.util.*;

class MinAndMAx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:-  ");
        int size = sc.nextInt();
        int Array[] = new int[size];
        System.out.println("Enter the Array Element:- ");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();
        }
        int min = Array[0];
        int max = Array[0];
        for (int i = 1; i < size; i++) {
            if (min > Array[i]) {
                min = Array[i];
            } else if (max < Array[i]) {
                max = Array[i];
            }
        }
        System.out.println("The maximan Number is:-  "+max);
        System.out.println("The minimam Number is:-  "+min);
    }
}
