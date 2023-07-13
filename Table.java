import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//getting input from user
		int num=sc.nextInt();
		int i;//init
		//loop for the table
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"=" +num*i);//printing 5*1=5
		}

	}

}
