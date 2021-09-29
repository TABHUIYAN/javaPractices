package javaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
		
		int p=10;
		
		try {
		int div=p/2;
		}catch(ArithmeticException e){
			System.out.println("AE is coming....");
			
		}
		finally {
			System.out.println("in finally block");
		}
		System.out.println("Bye!!!");
	}

	public int getMarks(String name) {
		if(name.equals("tom")) {
			return 80;
		}
		else if(name.equals("peter")) {
			return 90;
			}
		else {
			System.out.println("name is not found");
			return -1;
		}
	}
}
