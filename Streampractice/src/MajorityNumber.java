import jdk.jfr.Frequency;

import java.util.Arrays;

public class MajorityNumber {
    public static void main(String[] args) {

       int max = 0;
       int[] arr = {1,2,3,4,4,4,5,5};
       int[] frequency  = new int[arr.length+1];

       for(int i =0;i<arr.length;i++){
           int count = 1;
           for(int j=0;j< arr.length;j++){
               if(arr[i]==arr[j] && i!=j){
                       count++;
               }
               frequency[i] = count;

           }
       }
        System.out.println(Arrays.toString(frequency));
    }
}
