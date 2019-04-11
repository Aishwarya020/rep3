import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n,smalleven=0,maxodd=0;
		System.out.println("Enter the size of the array :");
		n=obj.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements into the array :");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=obj.nextInt();
		}
		 
		smalleven=arr[0];
		maxodd=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) 
			
			{
				
				System.out.println("even1");
				
				if(arr[i]<smalleven) {
				
					smalleven=arr[i];
				}
				
				}
			
			else {
				
				System.out.println("odd1");
				
				if(arr[i]>maxodd) {
					
				System.out.println("odd2");
				maxodd=arr[i];
			}
					
			
		}
			


		
	
}
		System.out.println("The smallest even element in the array is :" +smalleven);
		System.out.println("The largest odd element in the array is :"+maxodd);
}
}