import java.util.Scanner;

public class AssignmentWeek3 {

	public static void main(String[] args) {

		// 1a

		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		int x = ages.length - 1;

		System.out.println("1a: " + (ages[x] - ages[0]));

		// 1b

		int[] ages2 = new int[9];
		ages2[0] = 3;
		ages2[1] = 9;
		ages2[2] = 23;
		ages2[3] = 64;
		ages2[4] = 2;
		ages2[5] = 8;
		ages2[6] = 28;
		ages2[7] = 93;
		ages2[8] = 59;

		int y = ages2.length - 1;

		System.out.println("1b: " + (ages2[y] - ages2[0]));

		// 1c

		int sum = 0;

		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		int avgAge = sum / ages2.length;
		System.out.println("1c: Average age is " + avgAge);

		// 2a

		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		int sum1 = 0;

		for (int i = 0; i < names.length; i++) {
			int b = (names[i].length());
			sum1 += b;

		}
		int avgNumberLetters = sum1 / names.length;
		System.out.println("2a) Average number of letters per name is " + avgNumberLetters);

		// 2b

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");

		}

		// 3

		// The last element of an array is accessed by subtracting one from the length
		// of the Array:
		// NameoftheArray.length -1

		// 4
		// The first element of an array is accessed by:
		// NameoftheArray[0]

		// 5
		System.out.println();
		System.out.println("----- 5 -----");

		int[] nameLengths = new int[6];

		for (int i = 0; i < names.length; i++) {
			int newAssignedNumber = names[i].length();
			nameLengths[i] = newAssignedNumber;
			System.out.println(nameLengths[i]);

		}

		// 6
		System.out.println("----- 6 -----");
		int sum11 = 0;

		for (int i = 0; i < nameLengths.length; i++) {
			sum11 += nameLengths[i];

		}
		System.out.println(sum11);

		// 7
		System.out.println("----- 7 -----");
		System.out.println(multiplyString("Hello", 3));

		// 8
		System.out.println("----- 8 -----");
		System.out.println(createFullName("Rachel", "Green"));

		// 9
		System.out.println("----- 9 -----");
		int[] AgesSum = new int[5];
		AgesSum[0] = 25;
		AgesSum[1] = 25;
		AgesSum[2] = 75;
		AgesSum[3] = 20;
		AgesSum[4] = 25;

		System.out.println(" The sum ages of 5 siblings is greater than 100: " + agesSumOver100(AgesSum));

		// 10
		System.out.println("----- 10 -----");
		double[] score = new double[5];
		score[0] = 20.5;
		score[1] = 89.2;
		score[2] = 99.7;
		score[3] = 66.9;
		score[4] = 91.3;

		System.out.println("Average score is: " + findAverageScore(score));

		// 11

		System.out.println("------ 11 -----");
		
		double[] ClassA = new double[5];
		ClassA[0] = 70;
		ClassA[1] = 8;
		ClassA[2] = 5;
		ClassA[3] = 83;
		ClassA[4] = 88;

		double[] ClassB = new double[5];
		ClassB[0] = 64;
		ClassB[1] = 50;
		ClassB[2] = 85;
		ClassB[3] = 77;
		ClassB[4] = 90;

		System.out.println("Class A has a higher average GPA than Class B: " + compareAverageGrade(ClassA, ClassB));
		
		
		// 12
		
		System.out.println("----- 12 -----");
		
		boolean hotOutside = true;
		double pocketMoney = 200;

		System.out.println("It's hot outside and I have enought money to buy a drink: " + willBuyDrink(hotOutside, pocketMoney));



		// 13 
		// This method is designed to help you determine if you need an oil change based
		// on the miles driven since your last oil service and/or months since your last service.
		// If miles driven since last service exceed 7500 or if it has been more than 3 months 
		// since the last oil service, the method will return true. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ 13 -----");
		System.out.println("Hello, I can help you decide if your vehicle needs oil service.");
		System.out.println("Please enter miles driven since last oil service.");

		int lastOilChangeMiles = sc.nextInt();
		
		System.out.println("Please enter the number of months since the last oil service.");
		
		int lastOilChangeMonths = sc.nextInt();
		
		
		if (oilChangeNeeded(lastOilChangeMiles, lastOilChangeMonths)) {
			
			System.out.println("Oil change needed");
		} else
			System.out.println("No oil change needed.");
		
			
		
		
	}

	// 7
	public static String multiplyString(String word, int n) {
		String result = " ";
		for (int i = 0; i < n; i++) {
			result += word;

		}
		return result;
	}

	// 8

	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	// 9

	public static boolean agesSumOver100(int[] numbers) {

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		boolean over100 = sum > 100;
		return over100;
	}

	// 10

	public static double findAverageScore(double[] score) {
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		double avgScore = sum / score.length;

		return avgScore;
	}

	// 11

	public static boolean compareAverageGrade(double[] GradesClassA, double[] GradesClassB) {
		int sumClassA = 0;
		int sumClassB = 0;
		for (int i = 0; i < GradesClassA.length; i++) {
			sumClassA += GradesClassA[i];
		}
		double AvgSumClassA = sumClassA / GradesClassA.length;

		for (int i = 0; i < GradesClassB.length; i++) {
			sumClassB += GradesClassB[i];
		}
		double AvgSumClassB = sumClassB / GradesClassB.length;
		boolean AvgAGreaterThanB = AvgSumClassA > AvgSumClassB;
		return AvgAGreaterThanB;
	}

	
	//12 
	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean buyDrink = isHotOutside && moneyInPocket > 10.5;
		return buyDrink;
	}
	
	
	// 13
	
		public static boolean oilChangeNeeded (int milesDriven, int monthsDriven) {
			boolean oilChange = milesDriven > 7500 || monthsDriven > 3;
			return oilChange;
					
	
		}
	
}




