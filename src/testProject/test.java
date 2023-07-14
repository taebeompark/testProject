package testProject;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner ptb = new Scanner(System.in);
		
		System.out.print("문자열 입력:");
		
		String input = ptb.nextLine();
		
		System.out.println(input.charAt(0)+":"+ (int)input.charAt(0) );
		System.out.println(input.charAt(1)+":"+ (int)input.charAt(1) );
		System.out.println(input.charAt(2)+":"+ (int)input.charAt(2) );
		System.out.println(input.charAt(3)+":"+ (int)input.charAt(3) );
		System.out.println(input.charAt(4)+":"+ (int)input.charAt(4) );
		
		
		
	} 

}
