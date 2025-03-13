import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3};
        int[]arr2 = {0,4,5};
        int[] newArr = new int[arr1.length+ arr1.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                newArr[index] = arr1[i];
                i++;
            }else {
                newArr[index] = arr2[j];
                j++;
            }
            index++;
        }
        while(i < arr1.length){
            newArr[index] = arr1[i];
            i++;
        }
        while(j < arr2.length){
            newArr[index]= arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
