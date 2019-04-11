import java.util.Scanner;
public class Assignment1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		int num1,num2,sum,sub,mul,div,choice;
		
		System.out.println("Enter the 1st number :");
		num1 = obj.nextInt();
		System.out.println("Enter the 2nd number :");
		num2 = obj.nextInt() ;

		System.out.println("Enter your choice :");
		choice= obj.nextInt();
		
		switch(choice) {
		
		case 1: sum=num1+num2;
		System.out.println("The sum is :" +sum);
		
		break;
		
		case 2:sub=num1-num2;
		System.out.println("The subtraction gives :"+sub);
		
		break;
		
		
		case 3: mul=num1*num2;
		System.out.println("The product is :"+mul);
		
		break;
		
		
		case 4: div=num1/num2;
		System.out.println("The division gives :"+div);
		
		break;
		
		case 5: System.out.println("The choice chosen is invalid");
		
		
		}

		
	}

}
