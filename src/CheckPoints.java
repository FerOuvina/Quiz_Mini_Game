public class CheckPoints {
  public CheckPoints (int points) {
	if (points <= 0) {
	  System.out.println("Your answer was incorrect!");
	  System.out.println("Your total points are: " + points);
	} else {
	  points--;
	  System.out.println("Your answer was incorrect!" + "You have lost a point!");
	  System.out.println("Your total points are: " + points);
	}
  }
}

