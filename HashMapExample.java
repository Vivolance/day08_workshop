package sg.edu.nus.iss;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public void example() {
        Map<String, Integer> phones = new HashMap<>();

        phones.put("Iphone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 4);
        phones.put("Samsung", 20);

        System.out.println("Total phone types: " + phones.size());

        for (String key: phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
        }

        //Static method, specifying what to search, in this case "oppo":
        //String searchString = "Oppo";

        //otherwise, using console to read input from user for searchString: (non-static)
        String searchString = "";
        Console con = System.console();

        while (!searchString.equals("quit")) {
            searchString = con.readLine("Enter searchString: ");
        

            //Searching for a value in the hashmap:
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else { 
                System.out.println("Item not found");
            }

        }

        //remove all map data
        phones.clear();

        //check the size of map after clear
        System.out.println("Total phone types: " + phones.size());

    }
    
}
