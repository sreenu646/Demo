package sreenu.java.util;

import java.util.ArrayList;

public class ArrayListTest {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	System.out.println(a.add(12));
	System.out.println(a.add(12));
	System.out.println(a.add("hello"));
	System.out.println(a.add("java"));
	//System.out.println(2,"dotnet");
	a.add(2,"selenium");
	a.add(12);
	System.out.println(a.set(3,"Selenium"));
	System.out.println(a);
}

}
