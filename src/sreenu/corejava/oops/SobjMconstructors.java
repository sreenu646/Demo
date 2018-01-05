package sreenu.corejava.oops;
class D
{
	int a;
	D()
	{
		this(10);
		System.out.println("A default con");
	}
	D(int a)
	{
		System.out.println(a);
	}
}
class B extends D
{
	B(){
		System.out.println("B def con");
	}
}
public class SobjMconstructors {
public static void main(String[] args) {
	B b=new B();
}
}
