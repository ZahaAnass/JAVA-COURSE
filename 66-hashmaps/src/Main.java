import java.util.HashMap;

public class Main {

    public static void main(String[] args) {



        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.99);
        map.put("banana", 0.59);
        map.put("orange", 1.29);
        map.put("coconut", 1.00);

        map.remove("coconut"); // Remove key "coconut" and its value

//        map.put("banana", 0.69); // Update value for key "banana")

        System.out.println("Banana's value is " + map.get("banana")); // Get value for key "banana"

        System.out.println(map.containsKey("banana") ? "Banana is in the map" : "Banana is not in the map"); // Check if key "banana" exists
        System.out.println(map.containsValue(2.99) ? "Value 2.99 is in the map" : "Value 2.99 is not in the map"); // Check if value 2.99 exists

        System.out.println(map.size()); // Get the size of the map

        System.out.println(map);

        for (String key: map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }

    }

}