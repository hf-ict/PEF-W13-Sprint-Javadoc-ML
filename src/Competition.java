/**
 * Test class to test the classes Sprint and Athlete
 * @author Roger Zaugg
 * @version 1.0
 */
public class Competition {

	/**
	 * Entry point of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Sprint sprint = new Sprint();

		Athlete a1 = new Athlete("Coleman");
		sprint.addAthlete(a1);

		Athlete a2 = new Athlete("Gatlin");
		sprint.addAthlete(a2);

		Athlete a3 = new Athlete("De Grasse");
		sprint.addAthlete(a3);

		Athlete a4 = new Athlete("Simbine");
		sprint.addAthlete(a4);

		Athlete a5 = new Athlete("Blake");
		sprint.addAthlete(a5);

		Athlete a6 = new Athlete("Hughes");
		sprint.addAthlete(a6);

		Athlete a7 = new Athlete("Tortu");
		sprint.addAthlete(a7);

		Athlete a8 = new Athlete("Brown");
		sprint.addAthlete(a8);

		sprint.start();
		sprint.print();
	}
}
