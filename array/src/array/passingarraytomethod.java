package array;
public  class passingarraytomethod {

	static void min(int a[])
	{
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(min<a[i])
		{
			min=a[i];
		}
	}
	
	System.out.println(min);
}


	public static void main(String s[])
	{
		
		int a[]= {2,4,5,6};
		min(a);
	}
}
	



