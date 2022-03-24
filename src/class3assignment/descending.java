package class3assignment;

import java.util.Scanner;

public class descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,a;
		int arr[]=new int[5];
		try (Scanner s = new Scanner(System.in)) {
			for(i=0;i<=4;i++)
			{
				System.out.println("please enter the array elementgs to display");
				arr[i]= s.nextInt();
				
			}
		}
		for(i=0;i<=4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(arr[i]>arr[j])
				{
				a=arr[i];
				arr[i]=arr[j];
				arr[j]=a;
				}
				
			}
			System.out.println("the descending order is  "+ arr[i]);
		}
		
	}



	}


