package activites;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
        myList.add("Red");
        myList.add("Green");
        myList.add("Blue");
        myList.add(3, "Orange");
        myList.add(1, "Pink");
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Yellow is in list: " + myList.contains("Yellow"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Pink");
        
        System.out.println("New Size of ArrayList: " + myList.size());
        }
}
