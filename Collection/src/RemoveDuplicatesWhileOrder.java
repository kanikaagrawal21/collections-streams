import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesWhileOrder {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,5,6,6,7));
        LinkedHashSet<Integer> newList= new LinkedHashSet<>(list);
        System.out.println(newList);

    }

 }

