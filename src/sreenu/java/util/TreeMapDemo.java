package sreenu.java.util;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMapDemo t=new TreeMapDemo();
		TreeMap treeMap=new TreeMap();
		treeMap.put(1,100);
		treeMap.put(1,89);
		treeMap.put(5, "hghg");
		treeMap.put(3,78.98);
		treeMap.put(7,'d');
		System.out.println(treeMap);
	}
}
