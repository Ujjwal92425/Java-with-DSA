public class D10_ArrayPairs {

    public static void Pairs(int arr[]) {
        System.out.println("Pairs");
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + a + "," + arr[j] + ")");

            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Pairs(arr);
    }

}
