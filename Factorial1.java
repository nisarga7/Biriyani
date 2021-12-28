class Factorial1
{
    static void printFactorial()
    {
     int fact=1;
      for(int i=1;i<6;i++)
	{		
		fact=fact*i;
	}
		System.out.println(fact);
    }
	public static void main(String []args)
	{
		printFactorial();
	}
}


class FactSeries
{
	static void Factorial()
	{
int fact = 1;
for(int i=1;i<=7;i++)
{
	fact = fact*i;
	System.out.println(fact);
}
}
public static void main(String []args)
{
	 Factorial();
	 
	}
}



class Leapyear
{
	static void printLeapyear()
	{
		int year = 1996;
			if(year % 4 ==0)
	{
			System.out.println("Leap Year");
	}
		else if(year % 100 ==0)
	{
			System.out.println("a leap year");
	}
		else if(year % 400 ==0)
    {
			System.out.println("a leap year");	
	}
		else 
	{
			System.out.println("not a leap year");
	}
}	
	public static void main(String []args)
	{
	printLeapyear();	
	}
}



class Fibbo1
{
static void printFibbonacci()
{
int first=0,n=10,second=1;
for(int i=1;i<=n;i++)
{
System.out.println(first+"\t");
int next=first+second;
first=second;
second=next;
}
}
public static void main(String []args)
{
printFibbonacci();
}
}
