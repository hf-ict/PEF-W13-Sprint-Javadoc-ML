/**
 * Simulates a race where multiple athletes can participate
 * @author Roger Zaugg
 * @version 1.0
 */
public class Sprint {

	private Athlete[] athletes = new Athlete[8];

	/**
	 * Adds an athlete to the race
	 * @param athlete Athlete object
	 */
	public void addAthlete(Athlete athlete) {
		for (int i = 0; i < athletes.length; i++) {
			if (athletes[i] == null) {
				athletes[i] = athlete;
				break;
			}
		}
	}

	/**
	 * Starts the race by calculating the run time for each athlete
	 * @see Athlete#run()
	 */
	public void start() {
		for (int i = 0; i < athletes.length; i++) {
			Athlete a = athletes[i];
			if (a != null) {
				a.run();
			}
		}
	}

	/**
	 * Prints each athlete's name and run time to the console
	 */
	public void print() {
		for (Athlete a : this.athletes) {
			if (a != null) {
				System.out.println(a.getName() + ": " + a.getTime());
			}
		}
	}
}
