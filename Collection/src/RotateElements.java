import java.util.ArrayList;
import java.util.Collections;

public class RotateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        rotate(list);
        System.out.println(list);
    }
    public static void rotate(ArrayList<Integer> list){
        Collections.rotate(list,2);
    }
}
