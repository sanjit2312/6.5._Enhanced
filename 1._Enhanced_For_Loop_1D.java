package enhanced;

public class Enhanced_For_Loop_1D 
{

	public static void main(String[] args)
	{
		
		int num[]= {1,2,3,4,5,6};
		int total=0;
		for(int i : num)
		{
			total+=i;
			System.out.print(i+" ");
		}
		System.out.println("\nTotal= "+total);

		
		
	/*	int num[]= {1,2,3,4,5,6};
		int total=0;
		for(int i : num)
		{
			if(i==3)
			{
				continue;
			}
			total+=i;
			System.out.print(i+" ");
		}
		System.out.println("\nTotal= "+total);*/

	}

}
