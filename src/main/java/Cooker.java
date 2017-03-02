
 
	// interfaces differ from classes by using the interface keyword in decleration
public interface Cooker {
	

	public default void cook() {
		System.out.println("I cooked it");
	}
}
