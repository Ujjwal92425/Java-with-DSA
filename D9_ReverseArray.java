import java.util.Arrays;

public class D9_ReverseArray {

    static int[] Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int[] revArray = Reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(revArray));
        //Arrays.toString method in Java is used to convert an array into a readable string representation
        //like this [1, 2, 3, 4, 5]

    }
}
