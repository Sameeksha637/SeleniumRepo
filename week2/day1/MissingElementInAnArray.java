package week2.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
        int[] arr ={1,2,3,4,7,6,8};
		
		Arrays.sort(arr);   //1234678
		int n =0;
		for(int i=1;i<=arr.length;i++){
		    if(arr[n] != i ){
		        System.out.println("Missing element in an array is:"+i);
		        break;
		    }
		    else{
		        n++;
		        continue;
		    }
    }
		

	}
}

