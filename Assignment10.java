import java.util.Scanner;

public class Assignment10 {

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
					
					for(int j=i+1;j<arr.length;j++) {
						
					
					
					if(arr[i]>arr[j]) {
						
						
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
		
				
	}
				
				System.out.println("The smallest element of the array is"+arr[0]);
				System.out.println("The largest element of the array is :"+arr[n-1]);

}
}