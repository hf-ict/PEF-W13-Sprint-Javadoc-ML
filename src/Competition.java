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
		Athlete a1 = new Athlete("Coleman");
		Athlete a2 = new Athlete("Gatlin");
		Athlete a3 = new Athlete("De Grasse");
		Athlete a4 = new Athlete("Simbine");
		Athlete a5 = new Athlete("Blake");
		Athlete a6 = new Athlete("Hughes");
		Athlete a7 = new Athlete("Tortu");
		Athlete a8 = new Athlete("Brown");

		Sprint sprint = new Sprint();
		sprint.addAthlete(a1);
		sprint.addAthlete(a2);
		sprint.addAthlete(a3);
		sprint.addAthlete(a4);
		sprint.addAthlete(a5);
		sprint.addAthlete(a6);
		sprint.addAthlete(a7);
		sprint.addAthlete(a8);
		
		sprint.start();
		sprint.print();
	}

}
