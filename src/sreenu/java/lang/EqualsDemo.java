package sreenu.java.lang;

public class EqualsDemo {
public static void main(String[] args) {
	String s=new String("RameshSoft");
	String s1=new String("JavaSelenium");
	String s2=new String("Practisemore");
	String s3=s;
	System.out.println(s.equals(s1));
	System.out.println(s.equals(s2));
	System.out.println(s.equals(s3));
	StringBuffer sb=new StringBuffer("Java");
	System.out.println(s==s3);
	System.out.println(s.equals(sb));
}
}
