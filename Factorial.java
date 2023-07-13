import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;//init the first value is one
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number that you want the factorial");
		int num= sc.nextInt();
		
		//Creating loop for the factorial
		while(i<=num) {
			fact=fact*i;
			i++;
		}
    System.out.println("Factorial of"+num+"is "+fact);//output of factorial
	}

}
