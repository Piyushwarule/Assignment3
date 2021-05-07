import java.util.Scanner;

public class task4
{	
	public char avg(float total)
	{
		 float average = total/6;
	     char grade;
	        if(average>=80)
	        {
	            grade='A';
	        }
	        else if(average>=60 && average<80)
	        {
	        	grade='B';
	        } 
	        else if(average>=40 && average<60)
	        {
	        	grade='C';
	        }
	        else
	        {
	        	grade='D';
	        }
	        return grade;
	}
	
    public static void main(String args[])
    {
    	
        int marks[] = new int[6];
        int i;
        float total=0;
        Scanner sc = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = sc.nextInt();
           total = total + marks[i];
        }
        sc.close();
        
        task4 obj =new task4();
        char grade= obj.avg(total);
        System.out.print("The student Grade is: "+grade);
       
    }
}