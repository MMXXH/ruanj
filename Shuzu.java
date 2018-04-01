package aa;

import java.util.Scanner;

public class Shuzu{
	public static int max(int a[],int m)
	{  
		int sum=a[0];
		for(int i=0;i<a.length;i++)
		{
			int othersum=0;
			for(int j=i;j<a.length;j++)
			{
				othersum+=a[j];
				if(othersum>sum)
				sum=othersum;
			}	
		}	
		if(sum<=0)
		sum=0;
		return sum;
		
	}

	public static int main() {
		
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
