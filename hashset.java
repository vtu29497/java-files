import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();
        System.out.println("--- Testing Java HashSet ---");
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Apple"); 
        System.out.println("Total unique items in set: " + fruitSet.size());
        System.out.println("Set contents: " + fruitSet);
        System.out.println("----------------------------------------");
        String searchItem = "Banana";
        if (fruitSet.contains(searchItem)) {
            System.out.println("✔ " + searchItem + " is found in the set!");
        } else {
            System.out.println("❌ " + searchItem + " is NOT in the set.");
        }
        System.out.println("Removing 'Orange'...");
        fruitSet.remove("Orange");
        System.out.println("Final Set contents: " + fruitSet);
    }
}
