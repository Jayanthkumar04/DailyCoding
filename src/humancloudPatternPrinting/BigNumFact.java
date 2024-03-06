package humancloudPatternPrinting;

import java.math.BigInteger;

public class BigNumFact {

	public static void main(String[] args) {

		int n=20;
		
		BigInteger fact = new BigInteger("1");
		
		for(int i=1;i<=20;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(fact);
		
		BigInteger bi = new BigInteger("2");
		
		
		System.out.println(bi.nextProbablePrime());
		
	}

}
