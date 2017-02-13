
public class CookerApp {

	public static void main(String[] args) {
		Cooker myGrill = new Grill();
		Cooker cookerMy = new Cooker();
		Cooker myStove = new Stove();
		Cooker myPizOven = new PizzaOven();
		
		
		cookerMy.cook();
		myGrill.cook();
		myStove.cook();
		myPizOven.cook();
		
	}

}
