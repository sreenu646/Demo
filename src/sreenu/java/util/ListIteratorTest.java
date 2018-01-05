package sreenu.java.util;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList();
	arrayList.add("wgg");
	arrayList.add("srinu");
	arrayList.add("ffeg");
	arrayList.add("wff");
	arrayList.add("hello");
	arrayList.add("java");
	System.out.println(arrayList);
	ListIterator listIterator=arrayList.listIterator();
	while(listIterator.hasNext())
	{
		String s=(String)listIterator.next();
		if(s.equalsIgnoreCase("Java"))
		{
			System.out.println("ok");
		}
	}
}
}
