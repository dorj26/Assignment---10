public class Prime {

	public boolean Test(int num)
	{
		int i,flag=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		if(flag==2)
			
			return true;
			else
			return false;
		
	}
}
