import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");//accepting number from user
		int num1=sc.nextInt();
		//checking whether the number is even or odd
		if(num1 % 2 ==0) {
			System.out.println(num1+ "is Even");
		}else {
			System.out.println(num1+ "is Odd");
		}
		
		

	}

}
