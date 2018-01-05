package sreenu.java.util;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet treeSet=new TreeSet();
	treeSet.add(100);
	treeSet.add(10);
	treeSet.add(100);
	treeSet.add(1);
	System.out.println(treeSet);
	ArrayList arrayList=new ArrayList();
	arrayList.addAll(treeSet);
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.get(arrayList.size()-1));
	System.out.println(arrayList.get(1));
}
}
