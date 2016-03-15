package org.campus02.arrays;

public class ArrayHelper {
	
	public static void main (String args[])
	{
		
	int[] test = new int[]{8,5,1,9,0,4,10,3,2};
		
		printarray(test);
		arrangeOrder(test);
		
		printarray(test);
	}

	
	public static void arrangeOrder(int[] numbers)
	{
		int a;
		int b;
		int count= 0;

		while(count <=numbers.length){
		for (int i = 0; i < numbers.length-1; i++) 
		{
			
			a=numbers[i];
			b=numbers[i+1];
			if (b<a)
			{
				count = 0;
				numbers[i]=b;
				numbers[i+1]=a;
			}
			else 
			{
				count++;
			}
		}
		}
	}
	public static void printarray(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i]+",");
		}
		System.out.println(" ");
	}
}
