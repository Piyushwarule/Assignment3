import java.util.Scanner;

class task8{  
  public static void main(String[] args)  {  
    int c=0,a,temp;
    int n;
	Scanner sc = new Scanner(System.in);		
	System.out.println("Please Enter any Number: ");
	n = sc.nextInt();
   
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}