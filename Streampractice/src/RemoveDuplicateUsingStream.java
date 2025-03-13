import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,4,5,5,6,7,7);
        List<Integer> arrList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(arrList);
    }
}
