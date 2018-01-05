package sreenu.corejava.oops;

class Test1
{
	int a;
	public Test1(int a)
	{
		super();
		this.a=a;
		System.out.println("Test 1 Parameter constructor"+a);
	}
	public Test1()
	{
		this(10);
		System.out.println("Test1 Default Constructor");
		
	}
}
	class Test2 extends Test1
	{
		public Test2()
		{
			super();
			
			System.out.println("Test2 Default constructor");
		}
		
	}

public class ThisSuperCnstrCalls {
 public static void main(String[] args) {
	Test2 t2=new Test2();
}
}
