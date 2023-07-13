import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice " );
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("you choose the Arithmetic operation");
			int res;
			Scanner sc1 = new Scanner(System.in);		
			System.out.println("Enter the  first number ");
			int num1=sc.nextInt();
			System.out.println("Enter the second number ");
			int num2=sc.nextInt();
			res=num1+num2;
			System.out.println("The result of two number is  :"+res);
	    break;
		case 2:
		  System.out.println("You choose ternary operation");
		  int num3=5;
		  int num4=7;
		  res=(num3>num4) ?num3:num4;
		  System.out.println("greatest value is" + res);
		  
	    break;
	    case 3:
		System.out.println("You choose the Relation operation");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the number one ");
			int number1=sc.nextInt();
			System.out.println("Enter the number two ");
			int number2=sc.nextInt();
			
			if(number1>=number2) {
				System.out.println("Number1 greater");
			}else {
				System.out.println("Number2 is greater");
			}
		break;
		case 4:
			System.out.println("You choose the Bitwise operator");
			//intial values
			int a=2;
			int b= 5;
			//bitwise AND 
			System.out.println("a|b" +(a|b));
			//bitwise OR
			System.out.println("a&b" +(a&b));
			
			
		}

	}

}
