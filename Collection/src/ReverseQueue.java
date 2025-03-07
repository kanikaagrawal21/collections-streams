

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();


        System.out.print("Enter the Number of elements you want to add: ");
        int size = scanner.nextInt();

        for(int i = 0; i < size; i++){
            queue.add(scanner.nextInt());
        }

        System.out.println(queue);

        reverseQueue(queue);
        System.out.println("--------------------------------------");

        System.out.println(queue);
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}


