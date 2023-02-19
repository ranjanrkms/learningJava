package learning.java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalFeautures {

	public static void main(String[] args) {
		
		String[] name=new String[10];
		name[4]="Ranjan";
		System.out.println("name[4]="+name[4]);
		//System.out.println("name[4]="+name[5].toLowerCase());//NullPointerException
		
		Optional<String> optionaName=Optional.empty();
		Optional<String> optionaEmpty=Optional.empty();
		
		
		optionaName=Optional.of(name[4]);
		optionaEmpty=Optional.ofNullable(name[5]);
		
		System.out.println("optionaName="+optionaName);
		System.out.println(optionaName.get());
		System.out.println("optionaEmpty="+optionaEmpty);
		//System.out.println(optionaEmpty.get()); //No value present
		
		System.out.println("isEmpty="+optionaName.isPresent());
		
		optionaName.ifPresent((temp)-> System.out.println("Can include lambda expression="+ temp));
		
		System.out.println(optionaName.orElse("This will print if value is null"));
		System.out.println(optionaEmpty.orElse("This will print if value is null"));
		
		
		System.out.println(optionaName.map(String::toUpperCase));
		System.out.println(optionaName.map(tmp->tmp.toUpperCase()));
		
		System.out.println("filter="+optionaName.filter(tmp->tmp.equals("Ranjan")));
		System.out.println("filter="+optionaName.filter(tmp->tmp.equals("TEST")));
		

		
		
		
		System.out.println(optionaEmpty.orElseThrow(NoSuchElementException::new));
		
	}

}
