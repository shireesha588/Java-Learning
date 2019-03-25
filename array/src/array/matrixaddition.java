package array;

public class matrixaddition {
	public static void main(String s[])
	{
		int a[][]= {{1,2,3},{2,3,4},{44,55,55}};
		int b[][]={{1,2,3},{2,3,4},{44,55,55}};
		int sum[][]=new int[3][3];
	System.out.println("matrix sum is:");
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			sum[i][j]=a[i][j]+b[i][j];
		
			System.out.print(sum[i][j]+"  ");
		}
		System.out.println();
}

}
}