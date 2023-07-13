import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the the First number");//Asking for input from usre
		int num1=sc.nextInt();
		
		System.out.println("Enter the the Second number");//Asking for input from usre
		int num2=sc.nextInt();
		
		System.out.println("Enter the the Third number");//Asking for input from usre
		int num3=sc.nextInt();
//		Creating if else for checking conditions
		if(num1>num2 || num1>num3) {
			System.out.println( num1+ "Num1 is the greatest");
		}
		else if(num2>num1 || num2>num3) {
			System.out.println( num2+"Num2 is the Greatest");
		}
		else {
			System.out.println( num3+ "Num3 is the Greatest");
		}
		

	}

}
