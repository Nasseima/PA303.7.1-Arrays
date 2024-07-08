import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String [] arr = {"2","4", "7", "1", "9"};
        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}

