import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter any number :");
		num=obj.nextInt();
		
		if((num%5==0) && (num%7==0)) {
			
			
			System.out.println("The number is divisible by 5 as well as by 7");
		}

	}

}
