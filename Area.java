import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14; //init pi value
		double area;//init
		double circumference ;//init

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius" );//Getting input from user
		int radius=sc.nextInt();
		area = pi * radius* radius;//Formula for area of circle
		circumference = 2 * radius*pi;//Formula for circumference
		System.out.println("Area of the circle is :" + area);//Output of area of circle
		System.out.println("Area of circumferenve is :"+circumference);//output for circumference
		
		
		

	}

}
