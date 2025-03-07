import java.util.Arrays;
import java.util.HashSet;

public class Subsets {
    public static void main(String[] args) {
        HashSet<Integer>set1 = new HashSet<>(Arrays.asList(2,3));
        HashSet<Integer>set2 = new HashSet<>(Arrays.asList(2,3,7,8,9));
        System.out.println(set2.containsAll(set1));

    }
}
