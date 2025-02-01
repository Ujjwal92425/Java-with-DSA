public class D7_LargestNumber {

    static int Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 3, 9, 4, 6, 8 };
        int result = Largest(arr);
        System.out.println(result);

    }

}
