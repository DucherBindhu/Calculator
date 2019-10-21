import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculArithmatic(sc);	

	}

	private static void calculArithmatic(Scanner sc) {
		int a,b;
		System.out.println("Enter value a:");
		a=sc.nextInt();
		System.out.println("Enter value b:");
		b=sc.nextInt();
		
		System.out.println("Enter operator:(+,-,*,/):");
		char operator=sc.next().charAt(0);
		
		int result=0;
		switch(operator) {
		case'+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'/':
			result=a/b;
			break;
		case'*':
			result=a*b;
			break;
			default:
				System.out.println("ERROR");
				break;
		}
		
		System.out.print(a+" "+operator+" "+b+" = "+result);
		
	}

}
