package week3.day3;

import java.util.*;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};
        
        //create a two empty Lists - list1 & list2
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        
        //Declare for loop iterator from 0 to array a.length and add into list1
        for (int i = 0; i < a.length; i++)
        {
            list1.add(a[i]);
        }
        
        //Declare for loop iterator from 0 to array b.length and add into another list2
        for (int i = 0; i < b.length; i++) {
            list2.add(b[i]);
        }
        
        //Compare Both list1 & list2 using a nested for loop
        for (int num1 : list1) {
            for (int num2 : list2) {
            	
            	//1)Print the matching number
                if (num1 == num2) {
                    System.out.println(num1);
                    break; 
                }
            }
        }

	}

}






