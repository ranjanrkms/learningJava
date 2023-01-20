import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class UserName implements Comparable<UserName>{
 private String name;
 
	
public UserName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


	@Override
	public int compareTo(UserName o) {
		// TODO Auto-generated method stub
		
		return getName().compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserName other = (UserName) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "UserName [name=" + name + "]";
	}
	
	
	
	
	
}

public class CollectionExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection- List, Set, Queue
		//Collection- Map: HashMap, TreeMap
		
		Set<String> set =new HashSet<>();
		set.add("Ranjan");
		set.add("John");
		set.add("Tom");
		set.add("Steve");
		set.add("Ranjan");
		
		System.out.println("Set="+set); //No order, no duplicate
		Iterator<String> i=set.iterator();
		while (i.hasNext()){
			System.out.println("Iterator-"+i.next());
		}
		
		
		Set<String> treeSet =new TreeSet<>();
		treeSet.add("Ranjan");
		treeSet.add("John");
		treeSet.add("Tom");
		treeSet.add("Steve");
		treeSet.add("Ranjan");
		
		System.out.println("treeSet="+set); //order is guaranteed 
		
		//Bulk Collection
		List list=new ArrayList();
		list.addAll(set);
		System.out.println("list="+list); //
		
		Collections.reverse(list);
		System.out.println("reverse list="+list);
		Collections.sort(list);
		System.out.println("Sorted list binarySearch="+Collections.binarySearch(list,"Ranjan"));
		System.out.println("Sorted list binarySearch="+Collections.binarySearch(list,"ABCD"));//some negative value
		System.out.println("Sorted list="+list);
		
		//Comparable Interface
		List<UserName> objList =new ArrayList();
		
		objList.add(new UserName("Ranjan"));
		objList.add(new UserName("Akshat"));
		objList.add(new UserName("AK"));
		objList.add(new UserName("SNM"));
		objList.add(new UserName("Ranjan"));
		objList.add(new UserName("Zen"));
		
		System.out.println("objList="+objList);
		
		Collections.sort(objList);
		System.out.println("Sorted objList="+objList);
		
		System.out.println("binarySearch="+Collections.binarySearch(objList, new UserName("SNM"))); //index location
		
		

	}

}
