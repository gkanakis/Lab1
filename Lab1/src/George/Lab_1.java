// George Kanakis, Zachary Berezansky, Jamie McKeon
// Lab 1, CISC 181-010

package George;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.*;

public class Lab_1 {

	public static void main(String[] args) {
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;

		double PV;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Annual Return while retired (in decimal form): ");
		double ar = input.nextDouble();
		r = (ar / 12);

		System.out.println("Years of Retirement: ");
		double yearsr = input.nextDouble();
		n = yearsr * 12;

		System.out.println("Required income: ");
		double income = input.nextDouble();
		y = income - 2642;

		f = 0;
		t = false;

		PV = FinanceLib.pv(r, n, y, f, t);

		System.out.println(PV);

		double PMT;

		System.out.println("Enter Anual Return while working (in decimal form): ");
		double ar1 = input.nextDouble();
		r = (ar1 / 12);

		System.out.println("Enter Years to work:");
		double YearsToWork = input.nextDouble();
		n = YearsToWork * 12;

		p = 0;
		f = PV;
		t = false;

		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);
	}
}