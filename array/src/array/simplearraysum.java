package array;

public class simplearraysum { 
	public static void main(String args[])
	{
		int arr[]= {22,33,44,55};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum is:" +sum);
	}
}
