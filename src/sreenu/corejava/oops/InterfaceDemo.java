package sreenu.corejava.oops;
interface I1
{
	void m1();
	void m2();
	void m3();
	void display();
}
abstract class C1 implements I1
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m3()
	{
		System.out.println("m3");
	}
	public void m6()
	{
		System.out.println("m6");
	}
}

public class InterfaceDemo extends C1
{
	public void display()
	{
		System.out.println("display");
	}
	public void m7()
	{
		System.out.println("m7");
	}
public static void main(String[] args) {
	
	I1 d=new InterfaceDemo();
	d.m1();
	d.m2();
	d.m3();
	//d.m6();
	d.display();
	
	
	
}
}
