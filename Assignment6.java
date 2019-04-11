import java.util.Scanner;

public class Assignment6 {

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
		
		if((num1>num2)&&(num1>num3)) {
			
			System.out.println("num1 is greatest" +num1);
			
		}

		
		
		if((num1>num2)||(num2>num3)) {
			
			System.out.println("Either "+num1+"is greater than"+num3+"or"+num2+"is greater than"+num3);
		}
		
		if (num1%2!=0) {
			
			System.out.println(num1+"is not even");
		}
	}

}
