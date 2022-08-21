class A {
	A(int a, int b) {
		System.out.println("addition of integers:" + (a + b));
	}

	A(double a, double b) {
		System.out.println("addition of double numbers:" + (a + b));
	}

	void add(int a, int b) {
		System.out.println("addition of integers:" + (a + b));
	}

	void add(double a, double b) {
		System.out.println("addition of double numbers:" + (a + b));
	}
}

public class Test {
	
	public static void main(String args[]) {
		System.out.println("constructor overloading:");
		A a = new A(2, 3);
		A b = new A(2.4f, 5.6f);
		System.out.println("method overloading");
		a.add(3, 5);
		b.add(5.6f, 3.5f);
	}
	
}
