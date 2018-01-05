package sreenu.corejava.oops;
interface I3
{
	void m1();
	void m2();
}
interface I2 extends I3
{
	void m3();
	void m4();
}
abstract class sample implements I2
{
	public void m1()
	{
		System.out.println("m1");
	}
	@Override
	public void m2() {
		System.out.println("m2");
		}
	@Override
	public void m3() {
		System.out.println("m3");
		}
	public void m5()
	{
		System.out.println("m5");
	}
}
public class Interface_Multiple extends sample
{
 @Override
public void m4() {
	System.out.println("m4");
	}
 public static void main(String[] args)
 {
	Interface_Multiple m=new Interface_Multiple();
	m.m1();
	m.m2();
	m.m3();
	m.m4();
	m.m5();
	
}
}
