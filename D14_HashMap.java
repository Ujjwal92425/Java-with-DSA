import java.util.HashMap;

public class D14_HashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> record=new HashMap<>();

        record.put(1,"Ujjwal");
        record.put(2,"Shiv");

        record.put(3,"Shubham");

        record.put(4,"Himanshu");

        record.put(5,"Ujjwal");
        
        for (Integer key : record.keySet()) {
            System.out.println(key + " -> " + record.get(key) );
        }
        


    }
    
}
