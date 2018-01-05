package sreenu.java.lang;

public class CloneDemo implements Cloneable
{
	int i=10,j=20;
public static void main(String[] args) throws CloneNotSupportedException {
	CloneDemo c=new CloneDemo();
	CloneDemo clone1=(CloneDemo)c.clone();
	clone1.i=80;
	clone1.j=90;
	System.out.println(c.i);
	System.out.println(c.j);
	System.out.println(clone1.i);
	System.out.println(clone1.j);
	System.out.println(c.hashCode());
	System.out.println(clone1.hashCode());
}
}
