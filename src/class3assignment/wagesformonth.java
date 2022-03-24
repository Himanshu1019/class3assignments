package class3assignment;

import java.util.Scanner;

public class wagesformonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,hour,amount,days,totalhours,wage;
		Scanner s =new Scanner(System.in);
		System.out.println("please enter daily working hours");
		 hour=s.nextInt();
		 System.out.println("please enter daily working days");
		 days=s.nextInt();
		 System.out.println("please enter amount per hours");
		 amount=s.nextInt();
		 
		totalhours=days*hour;
		wage=totalhours*amount;
		System.out.println("the total monthly wage of the employee is "+wage);

	}

}
