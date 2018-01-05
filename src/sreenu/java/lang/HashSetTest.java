package sreenu.java.lang;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	HashSet hashSet=new HashSet();
	System.out.println(hashSet.add(10));
	System.out.println(hashSet.add(10));
	System.out.println(hashSet.add("hello"));
	System.out.println(hashSet.add("hello"));
	System.out.println(hashSet.add(12.56));
	System.out.println(hashSet.add(45.65));
	System.out.println(hashSet.add(6));
	System.out.println(hashSet);
	System.out.println("Hashcode of hashset is:"+hashSet.hashCode());
	
}
}
