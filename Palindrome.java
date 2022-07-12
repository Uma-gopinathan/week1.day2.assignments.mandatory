package Week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="race";
		//String str2="pop";
		//String str3="race";
		//String str4="liril";
		String rev ="";
		int length;
		//String var;

		//for(int i=1;i<5;i++) {
			//var="str"+i;
			length=str.length();
			char[] charArray=str.toCharArray();
			for(int j=length-1;j>=0;j--) {
				//storing the characters from the last index to first in the rev string
				rev=rev+ charArray[j];
			}
			if(str.equals(rev)) {
				System.out.println("The string: " + str + " is a palindrome");
				System.out.println("The reversed string is: " + rev);	
			}
			else {
				System.out.println("The string: " + str + " is not a palindrome");	
				System.out.println("The reversed string is: " + rev);	
			}
		//}
	}


}
