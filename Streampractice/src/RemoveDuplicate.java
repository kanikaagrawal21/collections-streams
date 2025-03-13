import java.util.Arrays;



public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 5, 6, 5};
        int[] newArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (newArr[j] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(newArr[i]);
        }
}
}




