// we dont want people to create an applicane. only a specific type
//of appliance(subclass)
//so we make it abstract

public abstract class Appliance {
	boolean powered;

	public boolean isPowered() {
		return powered;
	}
	
	//toggle does the opposite of current position
	public void togglePower() {
		powered = !powered;
	}

}

