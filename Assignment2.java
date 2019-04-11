import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		int choice;
		double dim1,dim2,ar ;
		
		System.out.println("1.Circle" + "\n" + "2.Square" + "\n" + "3.Triangle" + "\n" +"4.Rectangle");
		System.out.println();
		System.out.println("Enter your choice :");
		choice= obj.nextInt();
		
		switch(choice) {
		
		case 1:
			
			System.out.println("Enter the radius of the circle :");
			dim1=obj.nextDouble();
			
			ar= 3.14*dim1*dim1;
			
			System.out.println("The area of the circle is :"+ar);
			
			break;
			
			
		case 2:
			
			System.out.println("Enter the side of the square :");
			dim1=obj.nextDouble();
			
			ar=dim1*dim1;
			
			System.out.println("The area of the square is :" +ar);
			
			
		case 3:
			
			System.out.println("Enter the sides of the triangle :");
			dim1=obj.nextDouble();
			dim2=obj.nextDouble();
			
			ar=1*(dim1*dim2)/2 ;
			
			System.out.println("The area of the triangle is :"+ar);
			
			
		case 4:
			
			
			System.out.println("Enter the sides of the rectangle :");
			dim1=obj.nextDouble();
			dim2=obj.nextDouble();
			
			ar=dim1*dim2;
			
			System.out.println("The area of the rectangle is :"+ar);
			
		
		}
		

	}

}
