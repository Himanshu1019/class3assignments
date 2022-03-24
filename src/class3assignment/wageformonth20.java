package class3assignment;

import java.util.Scanner;

public class wageformonth20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount,days=20,wage;
		Scanner s =new Scanner(System.in);
		
		System.out.println("please enter amount per day");
		 amount=s.nextInt();
		 wage=days*amount;
		 System.out.println("the wages for 20 days is " + wage);
	}

}
