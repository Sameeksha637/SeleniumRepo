package week2.day1;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String s = "changeme";
		
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++){
		    if(i%2 !=0){
		        c[i] = Character.toUpperCase(c[i]);
		    }
		}
		
		String s1 = String.copyValueOf(c);
		System.out.println(s1);
	}

}
			

