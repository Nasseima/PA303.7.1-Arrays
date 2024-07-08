import java.util.Arrays;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        int num = sc.nextInt();

        String [] arr = new String [num];

        for ( int i = 0; i < arr.length; i++) {
            System.out.println("Enter your thing");
            Scanner ac = new Scanner(System.in);
            String thing = ac.nextLine();
            arr[i] = thing;
        }

        System.out.println(Arrays.toString(arr));

    }
}