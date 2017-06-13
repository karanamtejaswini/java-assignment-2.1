import java.util.Scanner;


class Greatestnumber
{
public static void main(String[] args) 
{
		int a,b,c,largest;
		
		Scanner s = new Scanner(System.in);
		
		//Greatestnumber s = new Greatestnumber();
		
		//Add a = new Add(10,30);
		
		System.out.println("Enter any three numbers: ");
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		

		System.out.println("a=: "+a);
		System.out.println("b=: "+b);
		System.out.println("c=: "+c);
		
		
		largest=(a>b)?(a>c?a:c):(b>c?b:c);
		
		
		
		System.out.println("Largest number: "+largest);
}
}
