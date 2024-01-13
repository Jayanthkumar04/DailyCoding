package JAVACW;

public class TerenaryOp {

	public static void main(String[] args) {

		int a = 20,b = 40,c = 10;
		
		int ans=(a>b)?((a>c) ? a : c):(b>c) ? b:c;
		
		System.out.println(ans);
	}

}
