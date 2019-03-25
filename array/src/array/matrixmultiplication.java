package array;

public class matrixmultiplication {
	public static void main(String s[])
	{
		int a[][]= {{1,2,3},{2,3,2},{2,3,4}};
		int b[][]= {{2,3,4},{2,3,1},{1,2,3}};
		int mul[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				mul[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}

}
