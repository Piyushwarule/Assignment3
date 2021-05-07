import java.util.Scanner;

public class task13
{
  static void bin(long n)
  {
    long i;
    System.out.print("0");
    for (i = 1 << 30; i > 0; i = i / 2)
    {
      if((n & i) != 0)
      {
        System.out.print("1");
      }
      else
      {
        System.out.print("0");
      }
    }
  }
 
  
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
      System.out.print("Input a number: ");
      int n = scan.nextInt();
    
      bin(n);
    
  }
}
 