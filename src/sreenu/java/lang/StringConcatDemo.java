package sreenu.java.lang;

public class StringConcatDemo {
public static void main(String[] args) {
	String s=new String("hello");
	String s1=s.concat("Java");
	StringBuffer sb=new StringBuffer("Hi");
	sb.append("java");
	System.out.println(s);
	System.out.println(s1);
	System.out.println(sb);
}
}
