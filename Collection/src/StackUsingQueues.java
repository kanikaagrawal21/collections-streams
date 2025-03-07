import java.util.*;

class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.poll();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }


    public int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.peek();
        q2.add(q1.poll());

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
    }
}
