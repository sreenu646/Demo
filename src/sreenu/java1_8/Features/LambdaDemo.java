package sreenu.java1_8.Features;
@FunctionalInterface
interface i2
{
	int get(String s);
	
}
public class LambdaDemo {
public static void main(String[] args) {
	i2 i=(String u)->{int c=u.length();
	                  return c;
	                  };
	                  System.out.println(i.get("hihwru"));
}

}
