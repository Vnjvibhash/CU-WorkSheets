public class Shape {
	
	public void draw(){
		
		System.out.println("Draw a beautiful Shape like Picasso");
		
	}
	
	public void erase(){
		
		System.out.println("Erase the shape and make something Incredible");
		
	}

	
}

class Circle extends Shape{
	
	public void draw(){
		System.out.println("This circle looks Amazing");
	}
	
	
}

class Rectangle extends Shape{
	
	public void erase(){
		System.out.println("Erase that shape and make Rectangle");
	}
	
}

class Square extends Shape{
	
	public void draw(){
		System.out.println("This Square is Perfect");
	}
	
	public void erase(){
		System.out.println("Erasing this Square is insanely sad.");
	}
	
}

class ShapeTester{
	
public static void main(String[] args) {
		
		Shape shape = new Shape();
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		Square sq = new Square();
		
		shape.draw();
		rec.draw();
		rec.erase();
		cir.draw();
		sq.draw();
		
	}
	
}
