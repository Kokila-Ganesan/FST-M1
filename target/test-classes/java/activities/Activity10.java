package activites;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Star Fruit");
        hs.add("Gova");
        hs.add("Blum");
        System.out.println("Original HashSet: " + hs);        
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("Apple"));
        if(hs.remove("Blum")) {
        	System.out.println("Blum removed from the Set");
        } else {
        	System.out.println("Blum is not present in the Set");
        }
        System.out.println("Checking if M is present: " + hs.contains("Star Fruit"));
        System.out.println("Updated HashSet: " + hs);
	}

}
