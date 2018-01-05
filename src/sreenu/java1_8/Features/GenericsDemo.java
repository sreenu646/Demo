package sreenu.java1_8.Features;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GenericsDemo {
public static void main(String[] args) {
	List<String>a=new LinkedList();
	a.add("Automation");
	a.add("java");
	a.add("RPA");
	a.add("DotNet");
	a.add("PHP");
	ListIterator<String>l=a.listIterator();
	while(l.hasNext())
	{
		String s=l.next();
		System.out.println(s);
	}
}
}
