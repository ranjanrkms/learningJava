package learning.java8;

public interface InterfaceDefaultMethodA {

public void testMethod();

public default void java8Defaultmethod() { 
System.out.println("This is a java8Defaultmethod concrete method inside Interface A"); //Java 8
 }
//Static methods are allowed now in Interface
public static float valueOfPi() {
	System.out.println("Static menthods are allowed now in Interface");
	return 3.14f;
}

public static void main(String[] args) {
	System.out.println("We can run interface class also since main is a static method");
}

}
