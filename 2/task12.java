class task12{
	
	public void first()
	{
		int counter=0;
		   int num=1;
		   int i=0;
		   System.out.print(num);
		   while(i<20){
			   
				   num=num*(-2);
				   System.out.print(" "+num);
				   i++;
			   }
	}
	
	public void third()
	{	
		int i=0;
		int result=1;
		int counter=0;
		System.out.print(result);
		while(i<20){
			i++;
			if(counter%2==0){
				result=result+2;
			}
			else{
				result=result+3;
			}
			System.out.print(" "+result);
			counter++;
			
		}
	}
	public void second() 
	{
		int diff=1;
		int result=0;
		int i=0;
		while(i<20){
			result=result+diff;
			System.out.print(" "+result);
			diff++;
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		
		task12 obj =new task12();
		
		System.out.println("First Sequence");
		obj.first();
		System.out.println(" ");
		
		System.out.println("Second Sequence");
		obj.second();
		System.out.println(" ");
		
		System.out.println("Third Sequence");
		obj.third();
		
	}
	
}