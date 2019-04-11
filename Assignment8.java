import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		
		int n;
		System.out.println("Enter the size of the array :");
		n=obj.nextInt();
		
		
		int arr[]=new int[n];
		
		
		System.out.println("Enter the elements into the array :");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=obj.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			if((arr[i]%5==0) || (arr[i]%7==0)) {
				
				
				
				System.out.println("The element of array which is divisible by 5 or 7 is" +arr[i]);
			}
		}

	}

}
