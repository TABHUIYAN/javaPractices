package stringmanipulation;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String palindrome="Dot saw I was Tod";
		int len=palindrome.length();
		System.out.println(len);
		
		char[] tempCharArray=new char[len];
		char [] charArray=new char[len];
		
		//put original string in array characters
		for(int i=0;i<len;i++) {
			tempCharArray[i]=palindrome.charAt(i);
			
		}
		//reverse array of chars
		for(int j=0;j<len;j++) {
			charArray[j]=tempCharArray[len-1-j];
		}
		String reversePalindrome=new String(charArray);
		System.out.println(reversePalindrome);
	}

}
