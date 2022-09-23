public class DogWalkLauncher {

	//Main method for testing conditions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		DogOwner dogowner = new DogOwner();
		
		//Checking conditions
		if(d.needsToGo())System.out.println("Dog needs to go outside.");
		else System.out.println("Dog wants to stay here.");
		
		if(dogowner.takeForWalk(d))System.out.println("Dog owner is taking Dog for walk");
		else System.out.println("Dog owner is not going outside with Dog.");
		//System.out.println(d.needsToGo());
		//System.out.println(dogowner.takeForWalk(d));

	}

}
