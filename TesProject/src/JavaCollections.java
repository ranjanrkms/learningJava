import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaCollections {
	
	static ArrayList<String> listNames=new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Ranjan");
		listNames.add("Akshat");
		listNames.add("John");
		listNames.add("Ranjan");
		listNames.add("Steve");
		listNames.add("Ranjan");
		listNames.add("Steve");
		System.out.println(listNames);
		System.out.println("********************");
		
		System.out.println(listNames.remove(0));
		System.out.println(listNames);
		System.out.println(listNames.get(0));
		
		System.out.println("********************");
		System.out.println(listNames.remove("Ranjan"));//Removes first occurance
		System.out.println(listNames);
		System.out.println("********************");
		//Modify
		
		System.out.println(listNames.set(1, "John Modified"));
		System.out.println(listNames);
		System.out.println("********************");
		
		//Find position
		System.out.println(listNames.indexOf("John Modified"));// -1 if not found
		
		//Arraylist cannot contain int(primitive datatype) but only objects-below compilation
		//ArrayList<int> roll=new ArrayList<int>();
		//int wrapper class Integer(available for all Primitive datatype
		ArrayList<Integer> roll=new ArrayList<Integer>();
		
//Stack  LIFO ->push pop peek(view last element), search, isEmpty
		
//Linked List->Memory efficient but slow; ArrayList: Fast but not memory efficient
		//add,remove,set
//List Interface
//Iterator
		
		Iterator<String> itr =listNames.iterator();
		while(itr.hasNext()) {
			System.out.println("Itr="+itr.next());
		}

		
//ListIterator-It has additional methods to check previous etc not in for each
		ListIterator<String> lstItr =listNames.listIterator();
		while(lstItr.hasNext()) {
			System.out.println("List Itr="+lstItr.next());
		}
		
		
//Sort and reverse List method		
				listNames.sort(null);
				System.out.println("Sort"+listNames);
				
				Collections.reverse(listNames);		
				System.out.println("Reverse"+listNames);
				Collections.sort(listNames);		
				System.out.println("ollection sort"+listNames);
		
//compareTo 
		String x="eaae";
		String y="d";
		System.out.println(x.compareTo(y));//-3 //Works for Integer not variable int
//Collection.sort uses compareTo-->Custom compareTo	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
