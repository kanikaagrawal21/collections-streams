import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer>set2=new HashSet<>(Arrays.asList(2,7,8));
        HashSet<Integer>intersect = new HashSet<>(set1);
        HashSet<Integer>union=new HashSet<>(set1);
        intersect.addAll(set2);

        System.out.println( intersect);
        union.retainAll(set2);
        System.out.println(union);
    }
}
