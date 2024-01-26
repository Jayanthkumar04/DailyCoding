package stringsss;

public class ReverrseWithStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("jaya");
		
		int i=0;
		int j=sb.length()-1;
		while(i<j) {
			
			char temp = sb.charAt(i);
			
			sb.setCharAt(i,sb.charAt(j));
			
			sb.setCharAt(j, temp);
			
			
			
			i++;
			j--;
			
		}
		System.out.println(sb);
		
	}

}
