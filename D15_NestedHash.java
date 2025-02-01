import java.util.HashMap;
import java.util.HashSet;

public class D15_NestedHash {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> population = new HashMap<>();

        // Adding values correctly
        population.putIfAbsent("India", new HashSet<>());
        population.get("India").add("Punjab");
        population.get("India").add("Delhi");

        population.putIfAbsent("USA", new HashSet<>());
        population.get("USA").add("New York");
        population.get("USA").add("California");

        // Printing the nested HashMap
        for (String country : population.keySet()) {
            System.out.println(country + " -> " + population.get(country));
        }
    }
}
