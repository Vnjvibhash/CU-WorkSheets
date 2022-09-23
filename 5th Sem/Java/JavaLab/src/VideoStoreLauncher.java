public class VideoStoreLauncher {

	public static void main(String[] args) {
		
		VideoStore vs = new VideoStore();
		vs.addVideo("The Matrix");
		vs.addVideo("GodFather 2");
		vs.addVideo("Star Wars Episode IV: A New Hope");
		
		VideoStore.recieveRating("The Matrix", 4);
		VideoStore.recieveRating("GodFather 2", 5);
		VideoStore.recieveRating("Star Wars Episode IV: A New Hope", 5);
		VideoStore.recieveRating("Star Wars Episode IV: A New Hope", 3);
		VideoStore.recieveRating("Star Wars Episode IV: A New Hope", 4);

	}

}
