import java.util.*;

class MaximamSubArray {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:- ");
        int size = sc.nextInt();
        int Array[] = new int[size];
        System.out.println("Enter the Array Element:- ");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();

        }
        int Maxsum = Array[0];
        int currentSum = 0;
        for (int i = 0; i < size; i++) {
             currentSum += Array[i];
            if (currentSum > Maxsum) {
                Maxsum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("The Maximan Sum is :- "+ Maxsum);
    }
}
/*
Enter the Array size:- 
4
Enter the Array Element:- 
0 0 1 2
The Maximan Sum is :- 3
 */