import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        System.out.printf("Array in ascending order: %s", Arrays.toString(arr));
        System.out.printf("\n The smallest number is " + arr[0]);
        System.out.printf("\n The biggest number is " + arr[arr.length-1]);
    }
}
