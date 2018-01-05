package sreenu.corejava.oops;

class TestOne
{
	public void m1()
	{
		System.out.println("One:m1()");
	}
	public void m2()
	{
		System.out.println("One:m2()");
	}
}

class Two extends TestOne
{
	@Override
		public void m1(){
		System.out.println("Two:m1()");
	}
	public void  m4()
	{
		System.out.println("Two:m4()");
	}
}
public class OverrideTest {
	public static void main(String[] args)
	{
		TestOne o1=new TestOne();
		o1.m1();
		o1.m2();
		Two o2=new Two();
		o2.m1();
		o2.m2();
		o2.m4();
		TestOne t1=new Two();
		t1.m1();
		t1.m2();
	}
}
