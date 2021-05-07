
public class task4 {

	public static void main(String[] args) {
		int n=20;
		System.out.println("Sum of first 20 odd numbers");
		
		System.out.println("The odd numbers are:");
		
		int sum=0;
		for(int i=1;i<n*2;i=i+2) 
		{
			System.out.println(+i);
			sum=sum+i;
			
		}
		
		System.out.println("Sum of first 20 odd numbers is "+sum);

	}

}
