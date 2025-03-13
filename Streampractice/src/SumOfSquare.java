import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
        int sum = list.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
