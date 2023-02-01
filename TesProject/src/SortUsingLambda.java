import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "data [name=" + name + "]";
	}
	
	
}


public class SortUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data> list=new ArrayList<>();
		list.add(new Data("Ranjan"));
		list.add(new Data("John"));
		list.add(new Data("Erika"));
		list.add(new Data("Sonal"));
		list.add(new Data("Akshat"));
		list.add(new Data("Nic"));
		
		for(Data data:list) {
			System.out.println(data.getName());
			
		}
		System.out.println("**********After Normal Sort");
		
		Collections.sort(list, new Comparator<Data>() {

			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				//System.out.println(o1.getName().compareTo(o2.getName()));
				return o1.getName().compareTo(o2.getName());
				
			}
		});;
		
		for(Data data:list) {
			System.out.println(data.getName());
			
		}
		
//Using Lambda **Comparator is a functional interface
		
		Collections.sort(list, (Data o1, Data o2)->o1.getName().compareTo(o2.getName()));//Return keyword not needed for 1 line
		System.out.println("**********After Lambda Sort");
		for(Data data:list) {
			System.out.println(data.getName());
			
		}
		
		
		list.forEach(temp->System.out.println("Print List using forEach "+temp));
		
//Lambda custom sort
		Collections.sort(list, (Data o1, Data o2)->{	
		if(o1.getName().length()> o2.getName().length()) {
			return 1;
		}
		else if(o1.getName().length()< o2.getName().length()) {
			return -1;
		} else return 0;	
		});
		
		System.out.println("**********After Lambda custom Sort based on length");
		for(Data data:list) {
			System.out.println(data.getName());
			
		}
		
	}

}
