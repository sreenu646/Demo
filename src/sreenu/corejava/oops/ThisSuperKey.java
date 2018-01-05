package sreenu.corejava.oops;

class OneTest
{
	int a;
	public void hello()
	{
		System.out.println("Parent a value is"+a);
	}
}
	class TwoTest extends OneTest
	{
		int a;
		String s;
		public TwoTest(int a,String s)
		{
			this.a=a;
			this.s=s;
			super.a=a;
			super.hello();
		}
		public void display()
		{
			System.out.println(a+"-----"+s);
		}
	}

public class ThisSuperKey {
public static void main(String[] args) {
	TwoTest t=new TwoTest(45,"java");
	t.display();
	t.hello();
}
}
