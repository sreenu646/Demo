package sreenu.corejava.oops;

abstract class AbstractTwo
{
	int a=10;
	public void m2()
	{
		System.out.println(a);
	}
	abstract public void m1();
	abstract public void m3();
}
abstract class AbstractOne extends AbstractTwo
{
	@Override
	public void m1()
	{
		System.out.println("AbstractOne:m1()");
	}
}
class AbstractThree extends AbstractOne
{
	public void m3()
	{
		System.out.println("AbstractThree:m3()");
	}
	public void m4()
	{
		System.out.println("m4");
	}
}
public class Abstract {
public static void main(String[] args) {
	/*AbstractThree a=new AbstractThree();
	a.m1();
	a.m2();
	a.m3();*/
	AbstractOne a=new AbstractThree();
	a.m1();
	a.m2();
	a.m3();
}
	
}
