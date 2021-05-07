import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number");
		int row=sc.nextInt();
		
		for(i=0; i<=row; i++)   
		{   
		for(j=1; j<=(i * 2) -1; j++)   
		{   
		System.out.print("* ");   
		}   
		System.out.println();   
		
		}
		
		 for (i=0; i<=row-1; i++) 
	        { 
	            for ( j = row-1; j >= (i * 2) -1; j--)
	            {
	                System.out.print("* ");
	            }
	            for (int k = 1; k < i; k++)
	            {
	                System.out.print(" ");
	            }
	            
	            System.out.println();
	        }
}
}