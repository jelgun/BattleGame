package business;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlane plane = new Fighter(new Pulsejet());
		IPlane missilePlane = new Missile(plane);
		IPlane mrPlane = new Rocket(missilePlane);
		System.out.println(mrPlane.getParts());
		
		IShip ship = new Cruiser();
		IShip cannonShip = new Cannon(ship);
		IShip crShip = new Rocket(cannonShip);
		IShip crtor = new Torpedo(crShip);
		System.out.println(crtor.getParts());
	}

}
