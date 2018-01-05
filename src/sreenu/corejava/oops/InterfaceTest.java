package sreenu.corejava.oops;
public interface InterfaceTest
{
	public static void main(String[] args) {
		System.out.println("ghafdgs");
	}
}
interface S1
{
	void m1();
	void m2();
}
interface S2 extends S1
{
	void m3();
}
abstract class T
{
	abstract void m4();
	
}
abstract class W
{
	abstract void m5();
}
class C extends T implements S2
{
	C()
	{
		System.out.println("default");
	}
	void m4()
	{
		System.out.println("m4");
	}
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
}
//public interface InterfaceTest {
//public static void main(String[] args) {
	//C c1=new C();
	//c1.m1();
	//c1.m2();
	//c1.m3();
	//c1.m4();
//}
//}
