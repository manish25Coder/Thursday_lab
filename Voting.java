import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age : ");//Getting input from user
		int age = sc.nextInt();//init
		
		if(age>=18) {
			System.out.println("You are eligible for voting");//conditions
			
		}else {
			System.out.println("you are not eligible for voting");
		}

	}

}
