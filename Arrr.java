package com.rj;

import java.util.Scanner;

public class Arrr {
	public int max(int arr[],int m)
	{  
		int sum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int othersum=0;
			for(int j=i;j<arr.length;j++)
			{
				othersum+=arr[j];
				if(othersum>sum)
				sum=othersum;
			}	
		}	
		if(sum<=0)
		sum=0;
		return sum;
		
	}

	public int main() {
		
	   Scanner sc=new Scanner(System.in);
       int n,i;
       int a[]=new int[100];
       n=sc.nextInt();
       for(i=0;i<n;i++)
        a[i]=sc.nextInt();
       System.out.print(" "+max(a,n));
       System.out.println();
       sc.close();
       return 0;
		
	}
}
