import java.util.Scanner;
public class task1 {

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

}

}