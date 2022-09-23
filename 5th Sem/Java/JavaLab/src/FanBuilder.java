public class FanBuilder {

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean OnFan = false;
	
	private double radius = 5.0;
	private String color = "red";
	
	
	public FanBuilder(){
		
		System.out.println("The Excitements begins");
		
	}
	
	
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the onFan
	 */
	public boolean isOnFan() {
		return OnFan;
	}

	/**
	 * @param onFan the onFan to set
	 */
	public void setOnFan(boolean onFan) {
		OnFan = onFan;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString(){
		
		System.out.println("The speed of Fan is : " +speed);
		
		if(OnFan) System.out.println("Fan is ON");
		else System.out.println("Fan is OFF");
		
		System.out.println("Radius of Fan is : "+radius);
		
		System.out.println("Color of Fan is : "+color);
		return null;
		
	}

	public static void main(String[] args) {
		
		FanBuilder fb = new FanBuilder();
	    fb.setColor("blue");;
	    fb.setOnFan(true);
	    fb.setRadius(10.8);
	    fb.setSpeed(MEDIUM);
	    
	    System.out.println(fb.getColor());
	    System.out.println(fb.getRadius());
	    System.out.println(fb.getSpeed());;
	    System.out.println(fb.toString());
	    
	    

	}

}
