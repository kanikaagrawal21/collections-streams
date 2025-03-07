import java.util.*;

public class GenerateBinaryNumber {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String binary = queue.poll(); // Get the front binary number
            result.add(binary);

            // Generate next two binary numbers and add to the queue
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N)); // Output: [1, 10, 11, 100, 101]
    }
}

