import java.util.Scanner;

public class task4  
{  
	public static void main(String[] args)   
	{  
		int i, j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number");
		int row=sc.nextInt();
		for (i = 1; i <= row; i++)   
		{  
			for (j = 1; j <= i; j++)   
			{   
				System.out.print(j+" ");   
			}  
			for (j = i-1; j >= 1; j--)  
			{  
				System.out.print(j+" ");  
			}  
			System.out.println();  
		}  
	}  
}  