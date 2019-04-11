import java.util.Scanner;

public class Assignment9 {

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
			
			
			if(arr[i]%3!=0) {
				
				
				
				System.out.println("The element of array which is not divisible by 3 is : " +arr[i]);
			}
		}

	}

}
