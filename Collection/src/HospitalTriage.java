import java.util.PriorityQueue;



class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator (higher severity first)
        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.severity, a.severity) // Sort by severity (descending)
        );

        // Add patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Process patients in priority order
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().name);
        }
    }
}
