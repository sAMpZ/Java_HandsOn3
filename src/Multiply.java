import java.util.Scanner;


public class Multiply {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//get user input
		System.out.println("Enter the first number");
		String input_1 = scanner.next();

		System.out.println("Enter the second number");
		String input_2 = scanner.next();
		
		String result;
		
		//tries to parse the sting input first as integer then float & calls multiple method in Jonah class
		try {
			int number = Integer.parseInt(input_1);
			int number_2 = Integer.parseInt(input_2);
			result = Jonah.multiply(number, number_2).toString();
			
		} catch (NumberFormatException e) {

			try {
				float number = Float.parseFloat(input_1);
				float number_2 = Float.parseFloat(input_1);
				result = Jonah.multiply(number, number_2).toString();
				
			} catch (NumberFormatException x) {

				result = "An integer or float was not passed";
			}
			
			
		}
		
		System.out.println(result);
		
		scanner.close();

	}

}

class Jonah {

	public static Integer multiply(int a, int b) {

		return a * b;

	}

	public static Float multiply(float a, float b) {

		return a * b;
	}

}