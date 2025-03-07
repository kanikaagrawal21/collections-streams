import java.util.Arrays;
import java.util.HashSet;

public class TwoSetsAreEqual {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer>set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        set.equals(set1);
    }
}
