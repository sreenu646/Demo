package sreenu.java.lang;

import java.util.ArrayList;

public class ArrayListTest {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	System.out.println(a.add(12));
	System.out.println(a.add(12));
	a.add(2,"Java");
	a.add(12);
	System.out.println(a);
	System.out.println(a.set(3, "Selenium"));
	a.add(12);
	a.add("hello");
	a.add('s');
	a.add(35.23f);
	System.out.println(a.get(3));
	System.out.println(a);
	System.out.println(a.set(5,"DotNet"));
	System.out.println(a);
}
}
