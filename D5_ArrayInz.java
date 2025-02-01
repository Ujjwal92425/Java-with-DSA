import java.util.*;

public class D5_ArrayInz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size ");

        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = input.nextInt();

        }
        System.out.print("Elements : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        input.close();

    }

}