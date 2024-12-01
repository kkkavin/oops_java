import java.util.ArrayList;
import java.util.Collections;

public class CountryListManager {
    public static void main(String[] args) {
        // Step 1: Initialize an ArrayList named "myCountry" to store strings
        ArrayList<String> myCountry = new ArrayList<>();

        // Step 2: Display the initial size of the ArrayList
        System.out.println("Initial size of myCountry: " + myCountry.size());

        // Step 3: Add five country names to the ArrayList
        myCountry.add("Ireland");
        myCountry.add("UK");
        myCountry.add("AUS");
        myCountry.add("USA");
        myCountry.add("New Zealand");

        // Step 4: Display the size of the ArrayList after adding elements
        System.out.println("Size of myCountry after adding elements: " + myCountry.size());

        // Step 5: Display the contents of the ArrayList in ascending order
        Collections.sort(myCountry);
        System.out.println("Countries in ascending order: " + myCountry);

        // Step 6: Display the contents of the ArrayList in descending order
        Collections.sort(myCountry, Collections.reverseOrder());
        System.out.println("Countries in descending order: " + myCountry);

        // Step 7: Remove the country "AUS" from the ArrayList
        myCountry.remove("AUS");
        System.out.println("Countries after removing AUS: " + myCountry);

        // Step 8: Remove the country at index 2 from the ArrayList
        if (myCountry.size() > 2) {
            myCountry.remove(2);
            System.out.println("Countries after removing country at index 2: " + myCountry);
        } else {
            System.out.println("No country at index 2 to remove.");
        }
    }
}