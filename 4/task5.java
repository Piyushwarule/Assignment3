import java.util.Scanner; 

class task5 {
	
	public void ascending(int x, int y, int z)
	{
		if (x >= y){
            if (y >= z)
                System.out.print("In order " + z + " "+ y + " " + x);

            if  (z >= x)
                System.out.print("In order " + y + " "+ x + " " + z);

            if (x > z)
                System.out.print("In order " + y + " " + z + " " + x);
			}

    if (y > x)
    {
            if (z >= y)
                System.out.print("In order " + x + " " + y + " "+ z);
        if (z >= x)
            System.out.print("In order " + y + " " + x + " " + z);
        if (x > z)
            System.out.print("In order " + y + " " + z + " " + x);
    }

	}
	
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter three numbers.");

    int a = sc.nextInt();
    int b = sc.nextInt(); 
    int c = sc.nextInt();

    task5 obj =new task5();
    obj.ascending(a, b, c);

  }
}
