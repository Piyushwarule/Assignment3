import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=0;
		int counter=0;
		int sum=0;
		int average=0;
		
		System.out.println("Enter a series of values (0 to quit): ");
		
		while ((input = sc.nextInt()) != 0) 
		{
			if (input != 0)
	            sum = input + sum;
	            counter++;
		}
		
		 if (counter > 0) 
		 {
			 average = sum / counter;
			 
			 System.out.println("The average value is: " + average);
		 }else 
		 {
			 System.out.println("No data was entered.");
		 }
		

	}

}
