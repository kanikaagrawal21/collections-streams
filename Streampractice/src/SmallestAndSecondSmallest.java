public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int small = 100;
        int small2 = 100;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<small){
                small2 = small;
                small = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(small2);
    }
}
