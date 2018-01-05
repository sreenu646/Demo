package sreenu.java.lang;

public class ToStringDemo {
	String s;
	public ToStringDemo(String s) {
		this.s=s;
	}
	public String toString()
	{
		return s;
	}
public static void main(String[] args)
{
	String s=new String("hello");
	System.out.println(s.toString());
	Integer i=new Integer(60);
	System.out.println(i.toString());
	StringBuilder sb1=new StringBuilder("Dont Sleep");
	System.out.println(sb1);
	StringBuilder sb=new StringBuilder("Java");
	System.out.println(sb.toString());
	ToStringDemo t=new ToStringDemo("helloSelenium");
	System.out.println(t.toString());
	
}
}
