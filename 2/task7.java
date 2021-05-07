import java.util.Scanner;

class task7 {
    
    static int reversDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
 
    
    public static void main(String[] args)
    {	
    	int number;
    	Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		number = sc.nextInt();
        System.out.println("Reverse of no. is "
                           + reversDigits(number));
    }
}