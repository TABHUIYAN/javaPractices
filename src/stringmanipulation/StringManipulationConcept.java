package stringmanipulation;

public class StringManipulationConcept {

	public static void main(String[] args) {
		String str="This is my java code and I am so happy";
		int len=str.length();
		System.out.println("Length of string: "+len);//38
		int li=0;
		int hi=len-1;
		System.out.println("Printing lowest index: "+li);		
		System.out.println("Printing highest index: "+hi);
		System.out.println(str.charAt(2));

		System.out.println(str.charAt(37));
	//System.out.println(str.charAt(38)); //StringIndexOutOfBoundException
	
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf("s", str.indexOf('s')+1));
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Hello"));//-1 (if string is not found it will print -1
		
		String mesg="welcome admin";
		if(mesg.indexOf("admin")>=0) {
			System.out.println("Correct Message");
			}
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		//trim method
		String s1="   Hello world   ";
		System.out.println(s1.trim());
		
		String text="  1234";
		System.out.println(text.trim());
		
		//replace method
		String dob="01-06-1998";
		System.out.println(dob.replace('-', '/'));
		
		//replace specific String
		String s2="Hello Java and happy with Java";
		System.out.println(s2.replace("Java", "Python"));
		
		//contains
		String s3="welcome admin";
		//System.out.println(s3.contains("admin"));
		if (s3.contains("admin")) {
			System.out.println("Correct mesg");
		}
		
		System.out.println(s2.concat(s3).concat(" hello"));
		
		//comparison 
		String s4="This is my java code";
		String s5="This is my Java code";
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));// true or false
		
		//substring
		String s6="This is my order id 12345";
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0,9));
		System.out.println(s6.substring(s6.indexOf("id")+3, s6.length()));
		//split: 
		String test="Java;Python;JavaScript;Ruby";
		String arr[]=test.split(";");
		//System.out.println(test.split(";"));
		System.out.println(arr[0]);
		
		for(String e:arr) {
			System.out.println("Splited string in arrays"+e);
			
		}
	
	}

}
