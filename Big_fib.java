import java.math.*;
import java.util.Scanner;

public class Big_fib {
	
	public static final int END = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0;
		while (true){
			System.out.println("What fibonacci do you want to find?");
			System.out.print("Enter number here or type -1 to exit: ");
			in = sc.nextInt();
			if(in == END) break;
			System.out.println("Fibonacci result of " + in + " is... " + smart_fib(in).toString());
		}
		System.out.println("Thank you for participating.");
		sc.close();		

	}

	public static BigDecimal smart_fib(int n){
		MathContext mc = new MathContext(3);
		BigDecimal phi_plus = BigDecimal.valueOf((1 + Math.sqrt(5))/2);
//		System.out.println(phi_plus.toString());
		BigDecimal phi_minus = BigDecimal.valueOf((1 - Math.sqrt(5))/2);
		
		BigDecimal plus = phi_plus.pow(n).round(mc);
		BigDecimal minus = phi_minus.pow(n).round(mc);
		BigDecimal subtract = plus.subtract(minus).round(mc);
		
		return subtract.divide(BigDecimal.valueOf((long)Math.sqrt(5))).round(mc);
	}
	

}
