package sreenu.corejava.oops;

class A
{
	static
	{
		System.out.println("static Block");
	}
	//instance block
	{
		System.out.println("Instance Block");
	}
	A()
	{
		System.out.println("default constructor");
	}
}
public class InstanceBlock {

	public static void main(String[] args) {
		A a=new A();
		A a1=new A();
	}
}
