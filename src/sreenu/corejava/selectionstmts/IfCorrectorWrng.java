package sreenu.corejava.selectionstmts;

public class IfCorrectorWrng {
        public static void main(String[] args) {
			int a=90,b=90;
			if(a==b)
			System.out.println("a,b are equal");
			else
				System.out.println("else block");
			System.out.println("normal block");
			System.out.println("hi");
			if(a>=b)
				System.out.println("if");
				System.out.println("if1");
				if(a<b)
					a=200;
				else
					System.out.println("hello");
		}
}
