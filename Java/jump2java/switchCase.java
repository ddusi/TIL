package jump2java;

public class switchCase {
	public static void main(String[] args) {
		int month = 2;
		String monthString = "";
		switch (month) {
		case 1: monthString = "January";
				break;
		case 2: monthString = "February";
				break;
		}
		System.out.println(monthString);
	}
}
