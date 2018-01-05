package sreenu.corejava.oops;

class Test
{
	static
	{
		System.out.println("static block");
	}
	static public void m1()
	{
		System.out.println("m1");
	}
}

public class StaticBlock {
public static void main(String[] args) {
	
	Test.m1();
}
}
