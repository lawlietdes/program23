package Stringss;

public class Palindrome {
	public static void main (String arg[]) {
		System.out.println(isPalindrome("1a2"));
	}
	
	 public static int isPalindrome(String A) {
		 A = cleanString(A);
		 System.out.println(A);
		 int mid=((A.length())/2)+(A.length()%2);
		 for (int i = 0,j=A.length()-1; i < mid; i++,j--) {
			 System.out.println(A.charAt(i)+ " - " + A.charAt(j));
			 if(A.charAt(i)!=A.charAt(j)) {
				 return 0;
			 }
			 
		 }
		 return 1;
	 }
	 public static String cleanString(String A) {
		 A = A.toLowerCase();
		 A = A.replaceAll("[^a-z0-9]", " ");
		 A = A.replaceAll("\\s", "").trim();
		 return A;
	 }

}
