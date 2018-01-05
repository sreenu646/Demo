package sreenu.corejava.oops;

class TestOne1
{
	static public void m1()
	{
		System.out.println("A:m1");
	}
}
class TestTwo extends TestOne1
{
	static public void m1()
	{
		System.out.println("B:m1()");
	}
}
public class MethodHiding {
	public static void main(String[] args) {
		TestOne1 t1=new TestOne1();
		t1.m1();
		TestTwo t2=new TestTwo();
		t2.m1();
		TestOne1 t3=new TestTwo();
		t3.m1();
	}
	

}
