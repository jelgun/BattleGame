package business;


public class Cannon extends ShipPart{

	public Cannon(IShip ship) {
		super(3, 7, ship);
	}
	
	public AddableType getPartType() {
		return AddableType.CANNON;
	}
}
