import java.util.Scanner;

public class task10  
{  
public static void main(String[] args)   
{  
	 Scanner scan = new Scanner(System.in);
     System.out.print("Input two number: ");
     int x = scan.nextInt();
     int y = scan.nextInt();
     int gcd = 1;  
 
     for(int i = 1; i <= x && i <= y; i++)  
     {  
    	 if(x%i==0 && y%i==0)  
    	 gcd = i;  
     }  
     System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
}  
}  