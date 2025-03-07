import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(15);
        linkedList.add(10);
        linkedList.add(7);
        linkedList.add(6);
        linkedList.add(5);
        reverse(linkedList);
        System.out.println(linkedList);
        ArrayList<Integer> arrayList= new ArrayList<>();
       arrayList.add(15);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        reverse(arrayList);
        System.out.println(arrayList);
    }
    public static  <T> void reverse(List<T> list){
        int i = 0;
        int j = list.size()-1;
        while(i<j){
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
                    i++;
                    j--;
        }
    }
}
