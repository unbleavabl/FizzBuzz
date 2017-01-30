class FizzBuzzDemo
{
	public void FizzBuzz()
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0)
			{
				if(i % 5 == 0)
				{
					System.out.println("FizzBuzz");
				}
				System.out.println("Fizz");
			}
			else if(i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}

class Fizz
{
	public static void main(String[] args)
	{
		FizzBuzzDemo ob = new FizzBuzzDemo();
		ob.FizzBuzz();
	}
}
