import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		
		Prime number = new Prime();
		
		System.out.println(number.Test(n));
		
		
		
	}

}
