import java.util.HashMap;
import java.util.HashSet;

public class D15_NestedHash {
    public static void main(String[] args) {
        int arr[]={3,6,5,6,2,4,3,5};
        HashMap <Integer,Integer> count=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!count.containsKey(arr[i])) {
                count.put(arr[i],1);
            }
            else{
                count.put(arr[i],count.get(arr[i])+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(count.get(arr[i])==1) 
                System.out.println(arr[i]);
            }
            
        }
    }
