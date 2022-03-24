package class3assignment;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,largest;
		int arr[]=new int[5] ;
		Scanner s =new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			System.out.println("please enter the array elementgs to display");
			arr[i]=s.nextInt();
			
		}
		largest=arr[0];
		for(i=1;i<=4;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}System.out.println("largest is "+largest);
	}


	}


