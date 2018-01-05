package sreenu.java.util;

import java.util.ArrayList;

public class ObjectsHashCode {
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList();
	arrayList.add(10);
	arrayList.add(10);
	arrayList.add(100);
	arrayList.add(100);
	System.out.println(arrayList.hashCode());
	for(int i=0;i<arrayList.size();i++)
	{
		Object d=arrayList.get(i);
		System.out.println("HS:"+d.hashCode());
	}
}
}
