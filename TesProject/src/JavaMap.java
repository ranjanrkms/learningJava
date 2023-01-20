import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map =new HashMap<>() ; //Order not guaranteed

		map.put(1, "Ranjan");
		map.put(5, "Akshat");
		map.put(2, "Tom");
		map.put(3, "Jerry");
		map.put(2, "Hgjh");
	System.out.println("Map="+map);
	System.out.println("Get using index:"+map.get(5));
	
	for(Map.Entry<Integer, String> entry: map.entrySet()){
		System.out.println("entry:"+entry);
		System.out.println("entry key:"+entry.getKey()+" entry Value:"+entry.getValue());
		
	}
	
	
	for(Integer i: map.keySet()){
		System.out.println("Get using index:"+i+" "+map.get(i));	
	}
	
	
	//Collections.sort(map);
		
	}

}
