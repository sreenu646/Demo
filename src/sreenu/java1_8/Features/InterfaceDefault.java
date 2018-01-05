package sreenu.java1_8.Features;
interface Two
{
	void m1();
	default void m2()
	{
		System.out.println("interface default m2 method");
	}
}
public class InterfaceDefault implements Two {
	@Override
	public void m1()
	{
		System.out.println("Interface:m1");
	}
	public void m2()
	{
		System.out.println("interface:m2");
	}
public static void main(String[] args) {
	Two two=new InterfaceDefault();
	two.m1();
	two.m2();
	InterfaceDefault interfaceDefault=new InterfaceDefault();
	interfaceDefault.m1();
	interfaceDefault.m2();
}
}
