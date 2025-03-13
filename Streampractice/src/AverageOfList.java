import java.util.Arrays;
import java.util.List;

public class AverageOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,4,5,6,7,8,9);
       double avg = list.stream().mapToInt(i ->i.intValue()).average().orElse(0.0);
    }
}
