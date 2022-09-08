class a{
	int i;
	int j;
	a(){
		i=1;
		j=2;
		
	}
}
class Main{
	public static void main(String args[]) {
		a obj1=new a();
		a obj2=new a();
		System.out.println(obj1.equals(obj2));
	}
}