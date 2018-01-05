package sreenu.corejava.selectionstmts;

public class Basic {
	int a=90;
	static String name="rameshsoft";
	public void hello()
	{
		System.out.println(a);
		System.out.println(name);
	}
	static public  void display()
	{
	 System.out.println(name);
	}
	static public String wish()
	{
		return "hello this is my program";
	}
 public static void main(String[] args) {
	
	 Basic b=new Basic();
	 String s=b.name;
	 System.out.println(s);
	 System.out.println(b.name);
	 b.display();
	 b.wish();
	 b.hello();
}
}
