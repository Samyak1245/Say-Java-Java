import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. ArrayList Implementation
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Allows duplicates

        // 2. TreeSet Implementation
        TreeSet<String> uniqueSortedCountries = new TreeSet<>();
        uniqueSortedCountries.add("India");
        uniqueSortedCountries.add("Canada");
        uniqueSortedCountries.add("Brazil");
        uniqueSortedCountries.add("India"); // Duplicate ignored, elements sorted automatically

        // 3. HashMap Implementation
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // 4. Display the Contents of all 3 Collections
        System.out.println("--- ArrayList Contents (Ordered, Allows Duplicates) ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n--- TreeSet Contents (Sorted, Unique Elements) ---");
        for (String country : uniqueSortedCountries) {
            System.out.println(country);
        }

        System.out.println("\n--- HashMap Contents (Key-Value Pairs) ---");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
