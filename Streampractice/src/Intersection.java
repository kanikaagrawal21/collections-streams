import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        int[] newArr = new int[10];
        int index =0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    newArr[index] = arr[i];
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
