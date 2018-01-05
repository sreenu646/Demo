package sreenu.java1_8.Features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

//import org.openqa.selenium.WebElement;

@FunctionalInterface
interface Biggest
{
	int pickNumber(Collection E);
}
public class LambdaSeondHighNo {
	public static void main(String[] args) {
		
		Biggest b=(Collection e)->{
		
		TreeSet treeSet=new TreeSet(e);
		ArrayList l1=new ArrayList(treeSet);
		return (Integer)l1.get(l1.size()-2);
		};
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(30);
		ar.add(20);
		ar.add(40);
	int s=b.pickNumber(ar);
	System.out.println(s);
	}

}
