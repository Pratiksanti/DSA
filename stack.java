
import java.util.*;

class stack {
    int[] stack;
    int top;
    int size;

    public stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push() {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push more elements.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the element to push:");
            int element = sc.nextInt();
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No elements to pop.");
        } else {
            int element = stack[top--];
            System.out.println("Popped: " + element);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    void Exit() {
        System.out.println("Exiting the program...");
        System.exit(0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        stack obj = new stack(size);

        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    obj.Exit();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
