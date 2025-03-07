import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("15");
        arrayList.add("10");
        arrayList.add("15");
        arrayList.add("6");
        arrayList.add("15");
       Map<String,Integer> map =  frequency(arrayList);
        System.out.println(map);


    }
    public static Map<String,Integer> frequency(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<list.size();i++){
           if(map.containsKey(list.get(i))){
               map.put(list.get(i),map.get(list.get(i))+1);
           }else{
               map.put(list.get(i),1);
           }
        }
        return map;
    }
}
