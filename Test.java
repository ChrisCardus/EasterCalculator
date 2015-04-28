public class Test
{
	public static void main(String[] args)
	{
		int x = 1994;
		for(int i = 0; i < 20; i++)
		{
			Easter y1 = new Easter(x);
			System.out.println(y1);
			x++;
		}
	}
}
