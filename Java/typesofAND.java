package Java;

public class typesofAND {
	public static void main(String[] args) {
		int i=0 ; int j=5;
		boolean test=false;
		//&& = if first condition , true then evaluates 2nd condition. or else , it doesn't.
		test=(i>5) && (j++ >4);  
		System.out.println("i= "+ i);
		System.out.println("j= "+ j);
		System.out.println("&& evaluation result= "+ test);
		
		//& = evaluates both conditions no matter what 
		test=(i>5) & (j++ >4);
		System.out.println("i= "+ i);
		System.out.println("j= "+ j);
		System.out.println("& evaluation result= "+ test);
		}
}
