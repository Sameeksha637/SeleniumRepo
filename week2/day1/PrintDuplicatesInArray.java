package week2.day1;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	    
	    Arrays.sort(arr);
	    
		int n = arr.length;
		
		int count =0;
		int[] a = new int[3];
		
		
		for(int i=1;i<n;i++){
		    if(arr[i-1]==arr[i]){
		        a[count] = arr[i-1];
		        count++;
		    }
		}
		System.out.println("Duplicate values are:");
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i] + " ");
		}

	}

}
