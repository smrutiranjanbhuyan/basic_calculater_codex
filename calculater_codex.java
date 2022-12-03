
package smruti;
import java.util.Scanner;

public class calculater_codex {

	public static void main(String[] args) {
		char operater;
		Double a,b,c;
				Scanner Sc= new Scanner(System.in);
				System.out.println("Input 1st nuber");
				a=Sc.nextDouble();
				System.out.println("Choose an oporater:+,-,*,/");
				operater=Sc.next().charAt(0);
				System.out.println("Input 2nd number");
				b=Sc.nextDouble();
			
switch(operater) {
case '+':
	c=a+b;
	System.out.println("Addition=");
	System.out.println(a+b);
	break;
case '-':
	c=a-b;
	System.out.println("Subtractiom=");
	System.out.println(a-b);
	break;
case '*':
	c=a*b;
	System.out.println("Multiplication=");
	System.out.println(a*b);
	break;
case '/':
	c=a/b;
	System.out.println("Division=");
	System.out.println(a/b);
	break;
	default:
	System.out.println("invalid input");
}
			
			
				
				
				}
				
				
			
			


		}

	



	
