import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont = "y";

		System.out.println("Learn your squares and cubes!");
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.println("Please enter an integer: ");

			int userInt = scan.nextInt();

			System.out.println("\tNumber" + "\t" + "\tSquared" + "\t " + "\tCubed");

			System.out.println("\t=======" + "\t" + "\t=======" + "\t" + "\t=======");

			for (int num = 1; num <= userInt; num++) {
				System.out.println(
						"\t" + num + "\t" + "\t" + (int) (Math.pow(num, 2)) + "\t" + "\t" + (int) (Math.pow(num, 3)));
			}
			
			System.out.println("Continue? (y/n)");
			cont = scan.next();

		}
		
		System.out.println("Thank you. Goodbye.");
		
		scan.close();
	}
}
