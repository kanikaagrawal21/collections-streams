import java.util.Arrays;

public class zeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3,0,4};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            while(arr[i]!=0){
                i++;
            }
            while(arr[j]==0){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
