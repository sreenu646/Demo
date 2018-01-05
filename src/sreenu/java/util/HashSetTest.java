package sreenu.java.util;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	HashSet hashSet=new HashSet();
	System.out.println(hashSet.add(12));
	System.out.println(hashSet.add(12));
	System.out.println(hashSet.add("hello"));
	System.out.println(hashSet.add("java"));
	System.out.println(hashSet.add(12));
	System.out.println(hashSet.add("selenium"));
	System.out.println(hashSet.add("34.53"));
	System.out.println("hashcode of hashset"+hashSet.hashCode());
	System.out.println(hashSet.size());
}
}
