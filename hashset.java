import java.util.hashset;

public class hashset {
    public static void main(String[] args) {

        //Create a HashSet
        HashSet<String> set = =new HashSet<String>();

        //Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // This will not be addedas it's a duplicate

        // Peint the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element is in the HashSet
        if (set.contains("Banana")){
            System.out.println("Banana is in the HashSet");
        } else {
            System.out.println("Banana is not in the HashSet");
        }
        // Remove an element from the HashSet
        set.remove("Cherry");

        //Print the HashSet after removal
        System.out.println("HashSet after removal: " + set);
        }

        }
    }
}