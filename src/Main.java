import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
	int x = 5;
	int y = 7;
	int z = 10;
	int points = 0;

	Scanner scanner = new Scanner(System.in);

	//	First question
	System.out.println("\n" + "First question");
	String question_1 = "How much is: " + x + "*" + y;
	System.out.println(question_1);
	int userInput = scanner.nextInt();

	if (userInput == x * y) {
	  points++;
	  System.out.println("Your answer was correct!" + " You have gained a point!");
	  System.out.println("Your total points are: " + points);
	} else {
	  new CheckPoints(points);
	  System.out.println("The correct answer was: " + x * y);
	}

	//	Second question
	System.out.println("\n" + "Second question");
	String question_2 = "How much is: " + z + "*" + y;
	System.out.println(question_2);
	userInput = scanner.nextInt();

	if (userInput == z * y) {
	  points++;
	  System.out.println("Your answer was correct!" + " You have gained a point!");
	  System.out.println("Your total points are: " + points);
	} else {
	  new CheckPoints(points);
	  System.out.println("The correct answer was: " + z * y);
	}

	//	Third question
	System.out.println("\n" + "Third question");
	String question_3 = "How much is: " + x + "/" + z;
	System.out.println(question_3);
	userInput = scanner.nextInt();

	if (userInput == 0) {
	  points++;
	  System.out.println("Your answer was correct!" + " You have gained a point!");
	  System.out.println("Your total points are: " + points);
	} else {
	  new CheckPoints(points);
	  System.out.println("The correct answer was: " + 0);
	}

	System.out.println("\n" + "The game is over!");
	if (points <= 0) {
	  System.out.println("You Finished the game with: " + points + " points!");
	  System.out.println("You need to practice a little more math and try again");
	} else if (points < 3) {
	  System.out.println("Congrats!");
	  System.out.println("You Finished the game with: " + points + " points!");
	} else {
	  System.out.println("Congrats!");
	  System.out.println("You Finished the game with: " + points + " points!");
	  System.out.println("You are a math god!");
	}
  }
}

