import java.util.LinkedList;

public class NthElementFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        var first = list.listIterator();  // First pointer
        var second = list.listIterator(); // Second pointer

        // Move the first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return "N is too large";
            first.next();
        }

        // Move both pointers together until the first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // Second now points to the Nth element from the end
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println(findNthFromEnd(list, N)); // Output: D
    }
}
