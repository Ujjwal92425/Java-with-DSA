import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class D17_DistinctEleSubarray {
    public static void main(String[] args) {
        //set apporach

         int [] arr = {3,1,6,4,1,6,3,5,6,2};
        // int start =0;
        // int k=4;
        
        // int res[]=new int[arr.length-k+1];

        
        // while (start+k <= arr.length) 
        // {
        //     HashSet <Integer> set = new HashSet<>();
        //    for(int i=start;i< start+k;i++) {
        //     if(!set.contains(arr[i])) {
        //         set.add(arr[i]);
        //     }
        //     res[start]= set.size();
        //    }
        //    start++;
        // }
        // for (int i : res) {
        //     System.out.println(i);
            
        // }

        HashMap <Integer,Integer> hm=new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        int k=4;
        for (int i = 0; i < k; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        list.add(hm.size());
        int i=1;int j=k;
        while (j<arr.length) {
            hm.put(arr[i], hm.get(arr[i])-1);
            if(hm.get(arr[i])==0) {
                hm.remove(arr[i]);
            }
            i++;
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);j++;
            list.add(hm.size());
        }
        for (int count : list) {
            System.out.println(count);
   
        }
        
    }
}

    
