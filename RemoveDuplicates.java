package Week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "We learn java basics as part of java sessions in java week1";
		String text = "Come come learn java !!!";
		//String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		//split the string with " " and storing in an array
		String[] str=text.split(" ");
		int length=str.length;

		//for loop to iterate and check if "java" text is repeated
		for(int i=0;i<length;i++) {
			if(str[i].equalsIgnoreCase("come")) {
				count=count+1;
				if(count>1) {
					//replacing java word with "" if it occurs more than once
					str[i]="";}

			}
			//printing the string array elements in the same line in every iteration
			if(str[i]!="") {
				System.out.print(str[i]+" ");
			}
		}



	}

}


