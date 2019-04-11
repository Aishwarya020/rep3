import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Enter 1st enter :");
		num1=obj.nextInt();
		System.out.println("Enter 2nd enter :");
		num2=obj.nextInt();
		System.out.println("Enter 3rd enter :");
		num3=obj.nextInt();
		
		//and
		
		System.out.println("All of the numbers" + (num1 & num2 & num3));
		
	
		//or
		System.out.println("Printing either of the numbers :" +(num1|num2|num3));
		
		//xor
		System.out.println(num1^num3);
		
		//right shift
		
		int rshift=num1>>2;
		
		//left shift
		
		int lshift=num2>>3;
		
		
		

	}

}
