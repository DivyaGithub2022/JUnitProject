package junits;

//import java.util.Scanner;

public class StringFunctions {
	
	public static boolean isPalindrome(String str) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the word");
//			
//		str = scanner.next();
		
		int start = 0;
		int end = str.length()-1;
		
		while (start<end) {
			
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		return true;
		
		
		
	}
	

}
