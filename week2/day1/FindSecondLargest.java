package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		int len = data.length;
		
		Arrays.sort(data);
		System.out.println("sorted array:");
		for(int i=0;i<len;i++)
		{
			System.out.println(data[i]);
		}
		System.out.println("Second Largest number is:"+data[len-2]);

	}

}
