import java.util.*;
public class D13_HashSet {
    public static void main(String[] args) {

        HashSet <String> name = new HashSet<>();
        name.add("Ujjwal");
        name.add("Shiv");
        name.add("Shubham");
        name.add("Himanshu");
        name.add("Ujjwal");

        for (String item : name) {
            System.out.println(item);
        }
            
        
        
    }
    
}
