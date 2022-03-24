package class3assignment;

import java.util.Scanner;

public class parttimewage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,hour=8;
		Scanner s =new Scanner(System.in);
		System.out.println("please enter the amount per hour");
		int amount=s.nextInt();
		i=amount*hour;
		System.out.println("the daily wage of the employee is "+i);
	}

}
