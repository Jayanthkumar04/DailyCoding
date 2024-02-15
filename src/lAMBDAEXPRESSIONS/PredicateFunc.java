package lAMBDAEXPRESSIONS;

import java.util.function.Predicate;

public class PredicateFunc {

	public static void main(String[] args) {

		
//ex:1)check whether numbeer is greater than 10 or not
		
		Predicate<Integer> p = i->(i>10);
		
		System.out.println(p.test(20));
		
		
//		ex:2) check whether length of string is >4 or not
		
		Predicate<String> p2 = s->(s.length()>4);
		
		System.out.println("hello length >4 or not ?: "+p2.test("hello"));
		
		System.out.println("hii length >4 or not ?: "+p2.test("hii"));


//		ex3: check array of string whose length > 4 or not.
		
		String str[] = {"hello","hii","byee","bro","selenium"};
		
		for(String i : str)
		{
			Predicate<String> p3 = ss->(ss.length()>4);
			
			System.out.println("length of string "+i+" > 4 ?:"+p3.test(i));
			
			
		}
		
		
	}

}
