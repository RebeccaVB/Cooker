
public class CookerApp {

	public static void main(String[] args) {
		
		
		Cooker cookerMy = new Grill();
		cookerMy.cook();
		
		Grill mahGrill = new Grill();
		mahGrill.cook();
		
		Cooker myStove = new Stove();
		myStove.cook();
		
		Cooker myPizOven = new PizzaOven();
		myPizOven.cook();
		
		KitchenManager manager = new KitchenManager();
		
		Cooker kmPizOven = new PizzaOven();
		
		Grill kmGrill = new Grill();
		
		manager.handleCooking(kmGrill);
		manager.handleCooking(kmPizOven);
	
		System.out.println("********************");
		System.out.println("The GM is resposible for turning on the power");
		
		// cant instantiate abstract clasees or interfaces
		//Apliance genericAppliance = new Appliance()
		
		Appliance myDishwasher = new Dishwasher();
		
		System.out.println("is my dishwasher on ?" + myDishwasher.isPowered());
		myDishwasher.togglePower();
		System.out.println("is my dishwasher on ?" + myDishwasher.isPowered());
		
		Appliance grillAsAnAppliance = mahGrill;
				Cooker grillAsACooker = mahGrill;
		System.out.println("is my grill on ?" + mahGrill.isPowered());
		mahGrill.togglePower();
		System.out.println("is my dishwasher on ?" + mahGrill.isPowered());
	}

}
