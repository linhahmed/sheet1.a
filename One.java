import java.util.Scanner;
import java.math.BigInteger;

public class One 
{
    public static void Reverse(int[] arr)
    {
	int i,t; 
        for (i = 0; i < arr.length / 2; i++) 
	{ 
            t = arr[i]; 
            arr[i] = arr[arr.length - i - 1]; 
            arr[arr.length - i - 1] = t; 
        } 
    }
    public static int[] sumEvenOdd(int[] arr)
    {    
	int i;                                    
	int b[]={0,0};                            
        for (i = 0; i < arr.length ; i++) 
	{       
       	    if (arr[i]%2==0)
	    {                     
        	b[0]+=arr[i];                     
            }                                     
            else
	    {                                 
        	b[1]+=arr[i];                     
            }                                     
        }                                         
        return b;
    }
    public static double average(int[] arr)
    {
	int k;
	BigInteger result= BigInteger.valueOf(0);
	for (k = 0; k < arr.length; k++) 
	{                          
	    result=result.add(BigInteger.valueOf(arr[k]));
        } 
	double avg = result.doubleValue() / arr.length;
	return avg;
    }
    public static void moveValue(int[] arr, int val)
    {
	int k,count=0;
	for (k = 0; k < arr.length; k++) 
	{
       	    if(arr[k]!=val)
      	    {
	       arr[count]=arr[k];
	       count++;
            }                       
	} 
	while(count<arr.length)
	{
	    arr[count]=val;
	    count++;
	}
    }
    public static int[][] transpose(int[][] arr)
    {
	int i,j;
	int trans[][] = new int[arr[0].length][arr.length];
        for (i = 0; i < arr.length; i++)
        {	  
	    for (j = 0; j < arr[0].length; j++)
            {	 
	        trans[j][i] = arr[i][j];
	    }
        }
        return trans;
    }
    
}    
