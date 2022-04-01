package day11;

import java.util.Scanner;

public class Testing1 {

	 int arr[];
	 int n;
	 Scanner s= new Scanner(System.in);
		 
	 void input()
	 {
		 System.out.println("enter size of array");
		 n=s.nextInt();
		 arr= new int[n];//without this line it will give null pointer exception
		 for(int  i=0;i<n;i++)
		 {
			 System.out.println("enter number");
			 arr[i]=s.nextInt();
		 }
	 }
	 void show() {
		 for(int  i=0;i<n;i++)
		 {
			 System.out.println(" " + arr[i]);
			  
		 }
	 }
	 void sumarray() {
		 int sum=0;
		 for(int  i=0;i<arr.length;i++)
		 {
			 
			 sum= sum+arr[i];
		 }
		 System.out.println(" sum of array"+ sum);
		 
	 }
	 void evencount()
	 {
		 int count=0;
		 for(int  i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2==0) count++;
		 }
		 System.out.println(" Even count="+count);
		 
	 }
	  
	 void reverse() {
		 
		 for(int  i=arr.length-1; i>=0; i--)
		 {
			 System.out.println(" " + arr[i]);
			  
		 }
	 }
	 
	 void arraycopy()
	 {
		 int b[]= new int[n];
		 //b = arr;
		 
		 for(int i=0;i<b.length;i++)
		  {  b[i]= arr[i];
			 System.out.println( " b array"+ b[i]);
		 }
		  
	 }
	 
	 boolean search( int y)
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==y)	  return true;
		 }
		 return false;
				 
	 }
	 
	 void largest()
	 {
		 int max;
		 max=arr[0];
		 for(int i=1; i<arr.length;i++)
		 {
			 if(arr[i]>max)
				 max= arr[i];
		 }
		 System.out.println("largest number in array "+ max);
		 
	 }
	 //bubble sort
	 
	 void sort()
	 {
		 int temp;
	 
		 for(int i=1; i<arr.length-1;i++)
		 { 
			 for(int j=1; j<arr.length-1-i;j++)
			 {
              		if(arr[j]>arr[j+1])
              		{
              			temp= arr[j];
              			arr[j]= arr[j+1];
              			arr[j+1]= temp;
              		}
				 
			 }
		 }
		 
		 show();
		 
	 
	 
	 } 
	 
	 
	 

}
