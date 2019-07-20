import java.util.Arrays;

public class ClosestSumPair 
{
	public static void main(String[]args) 
	{
		int[] a1 = {-1, 3, 8, 2, 9, 5};
        int[] a2 = {4, 1, 2, 10, 5, 20};
        int aTarget = 24;
        //closestSumPair(a1, a2, aTarget); //should return {5, 20} or {3, 20}

        int[] b1 = {7, 4, 1, 10};
        int[] b2 = {4, 5, 8, 7};
        int bTarget = 13;
         int result[] = closestSumPair(b1, b2, bTarget); //should return {4, 8}, {7, 7}, {7, 5}, or {10, 4}
         
         System.out.println(result[0] + " "+ result[1]);

        int[] c1 = {6, 8, -1, -8, -3};
        int[] c2 = {4, -6, 2, 9, -3};
        int cTarget = 3;
        // closestSumPair(c1, c2, cTarget) should return {-1, 4} or {6, -3}

        int[] d1 = {19, 14, 6, 11, -16, 14, -16, -9, 16, 13};
        int[] d2 = {13, 9, -15, -2, -18, 16, 17, 2, -11, -7};
        int dTarget = -15;
        // closestSumPair(d1, d2, dTarget) should return {-16, 2}, {-9, -7}
        
        
	}
	
	public static int[] closestSumPair(int[] a,int[] b,int target) 
	{
		int result[] = new int[2];
				
		Arrays.sort(a);
		Arrays.sort(b);
		
		int smallestDiff = (a[0] + b[0]) - target;
		
		int sumArray[][] = new int[a.length][a.length];
		
		for(int i = 0; i < a.length; i++) 
		{
			for(int k = a.length-1; k < 0; k--) 
			{
				int currentDiff = ( a[i] + b[k])  - target;
				if(currentDiff > target) 
				{
					break;
				}
				if (currentDiff == 0) 
				{
	                result[0] = a[i];
	                result[1] = b[k];
	                return result;
				}				
			}
		}
		
		return result;
		
		/*
		for(int i = 0; i < a.length; i++) 
		{
			for(int k = 0; k < a.length; k++) 
			{
				System.out.print(sumArray[i][k]+" ");
			}
			System.out.println();
		} */
			
	}
}
