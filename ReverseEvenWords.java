package Week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester in India";
		int count=0;
		//split the string with " " and store in an array
		String[] str=text.split(" ");
		int length=str.length;
		String reversedStringAtEvenIndex;
		System.out.print("Original String is: ");
		System.out.println(text);
		System.out.println("String after reversing even position word: ");

		//for loop to iterate through the string array and reverse the words at even position
		for(int i=0;i<length;i++) {
			if(i%2==1) {
				//storing the word at even position to character array
				char[] charArray=str[i].toCharArray();
				int length2 = charArray.length;
				//assigning to null in every iteration
				reversedStringAtEvenIndex="";
				for(int j=length2-1;j>=0;j--) {
					reversedStringAtEvenIndex = reversedStringAtEvenIndex+charArray[j];
				}
				//printing after reversing
				System.out.print(reversedStringAtEvenIndex+" ");
			}
			else{

				//printing the odd index position array element
				System.out.print(str[i]+ " ");
			}

		
	}


}

}
