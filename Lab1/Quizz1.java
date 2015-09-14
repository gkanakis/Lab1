package George;

import java.util.Scanner;

public class Quiz1 {
	public static void QBrating(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double rating;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of attempts: ");
		double att = input.nextDouble();

		System.out.println("Enter amount of completions: ");
		double comp = input.nextDouble();

		System.out.println("Enter amount of yards: ");
		double yds = input.nextDouble();

		System.out.println("Enter amounr of touchdowns: ");
		double tds = input.nextDouble();

		System.out.println("Enter amount of Interceptions: ");
		double ints = input.nextDouble();

		a = ((comp / att) - 0.3) * 5;
		b = ((yds / att) - 3) * 0.25;
		c = (tds / att) * 20;
		d = 2.375 - ((ints / att) * 25);
		rating = ((a + b + c + d) / 6) * 100;

		System.out.println("The QB rating for this player is: " + rating);

	}
}
