package java2s;

public class Fibonacci {
	public static void main(String[] args)
	{
		int n1 = 1;
		int n2 = 1;
		int n3 = n1 + n2;
		System.out.printf("%d,%d, %d",n1,n2,n3);
		for (int i = 0; i <=100 ; i++)
		{
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			System.out.printf(",%d",n3);
		}
	}

}
