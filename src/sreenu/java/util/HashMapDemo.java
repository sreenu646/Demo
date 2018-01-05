package sreenu.java.util;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap hashMap=new HashMap(3);
	
	hashMap.put(1,"sreenu");
	hashMap.put("hello", 10);
	hashMap.put(2,20 );
	hashMap.put(2, 30);
	hashMap.put(4,"gdjwf");
	System.out.println(hashMap.size());;
	System.out.println(hashMap);
}
}
