package array;

public class largeno {
	public static void main(String s[])
	{
		double arr[]= {2,3.4,1.44,9.9,9.99};
		double max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			
	         if (arr[i] > max) 
	         {
	        	  max = arr[i];
	         }
		}
	    
		System.out.println("Max is " + max);  
	   
}

}
