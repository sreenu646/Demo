package sreenu.corejava.selectionstmts;

class Common
{
	public void login()
	{
		System.out.println("Common:login");
	}
	public void logout()
	{
		System.out.println("Common:logout");
	}
}
class one extends Common
{
	public void electronics()
	{
		System.out.println("one:electronics");
	}
	public void display()
	{
		System.out.println("one:Welcome to Flipkart for electronics");
	}
}
class Two extends Common
{
	public void kids()
	{
		System.out.println("Two:kids");
	}
	public void men()
	{
		System.out.println("Two:men");
	}
}

public class InheritenceTest {
public static void main(String[] args) {
	//creating object for parent class
	Common common=new Common();
	common.login();
	common.logout();
one one=new one();
	one.login();
	one.logout();
	one.electronics();
	one.display();
	Two two=new Two();
	two.kids();
	two.men();
	two.login();
	two.logout();
	
}
}
