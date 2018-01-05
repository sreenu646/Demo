package sreenu.java1_8.Features;
interface i1
{
	default void m1()
	{
		System.out.println("interface:m1()");
	}
	public static void m2()
	{
		System.out.println("interface:static methods");
	}
}
public class InterfaceStatic implements i1 {
public static void main(String[] args) {
	InterfaceStatic iStatic=new InterfaceStatic();
	iStatic.m1();
	i1.m2();
	i1 i=new InterfaceStatic();
	//i.m2();
}
}
