import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number ");

        int rows = scanner.nextInt();
        
        
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i )
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i=1; i<=rows-1; i++)
        {
            for (int j = rows-1; j >= i; j--)
            {
                if( j == rows-1 || j == i || i == rows)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}