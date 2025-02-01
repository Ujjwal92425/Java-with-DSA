public class D11_SubarrayPrint {

    public static void SubArray_Print(int arr[]) {
        System.out.println("Sub-array: ");
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int j2 = i; j2 < j; j2++) {

                    System.out.print(arr[j2]+" ");
                    
                }
                System.out.println();
                
            }
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,1,3,5,7,9};
        SubArray_Print(arr);
    }
    
}
