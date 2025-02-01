public class D8_BinarySearch {

    static boolean BinarySearch (int arr[],int key) {
        int left =0;
        int right =arr.length - 1;
        while (left <= right) {
        int mid = (left+right)/2;

        if(arr[mid]==key) {
            return true;
            // result= mid;
            // end = mid - 1; //If we have to get first index of that element which can be present multiple times.
        }
        else if(arr[mid]>key) {
            right = mid-1;
        }
        else {
            left = mid+1;
        }
    }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 9;

        boolean result = BinarySearch(arr,key);
        System.out.println(result);
    }

}
