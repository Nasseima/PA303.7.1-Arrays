import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7,};
        int newArr = arr[2];
        for(int i = 0; i < arr.length; i++){
        if (arr[i] != newArr) {
            System.out.println(arr[i]);

        }
        }
    }
}
