package week1.day2;

class Fibinocci{
public static void main(String args[])
{  
 int firstNum=0,secNum=1,n,i,range=8;  
 System.out.print(firstNum+" ");  
  
 for(i=1;i<range;++i)  
 {  
  n=firstNum+secNum;  
  System.out.print(" "+n);  
  firstNum=secNum;  
  secNum=n;  
 }  

}}

