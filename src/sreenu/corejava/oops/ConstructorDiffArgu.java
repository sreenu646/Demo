package sreenu.corejava.oops;
class ConstructorOne1
{
	int a;
	String s;
	public ConstructorOne1(int a1,String s1)
	{
	   a=a1;
	   s=s1;
	}
	public void display()
	{
		System.out.println(a+"----------------"+s);
	}
}
public class ConstructorDiffArgu {
	public static void main(String[] args) {
		 ConstructorOne1 c=new ConstructorOne1(20,"Hello");
		 c.display();
		 ConstructorOne1 c1=new ConstructorOne1(34,"Java");
		 c1.display();
	}

}
