package sreenu.corejava.selectionstmts;

public class SwitchDemo {
 public static void main(String[] args) {
	String browser="chrome1";
	switch(browser)
	{
	case "ie":
		 System.out.println("launching IE");
		 break;
	
	case "chrome":
		 System.out.println("launching chrome");
		 break;
	case "Firefox":
		 System.out.println("launching firefox");
		 break;
	case "mozilla":
		System.out.println("launching mozilla");
		break;
	default:
		System.out.println("launching sufari");
		break;
		
	
	}
	System.out.println("hello");
	System.out.println("hi");
}
}
