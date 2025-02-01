import java.util.*;

public class D6_LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element to search ");
        int target = input.nextInt();
        System.out.println("Enter Elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element "+arr[i]+" found at index " + i);
            }
        }
        input.close();

    }

}
