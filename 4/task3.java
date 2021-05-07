import java.util.Scanner;
public class task3
{   
	public float interest (float a, float b, float c)
	{
		float si=(a * b * c) / 100;
		return si;
	}
	
    public static void main(String args[]) 
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        
        task3 obj = new task3();
        
        sinterest = obj.interest(p, r, t);
        System.out.print("Simple Interest is: " +sinterest);
    }
}