
public class MainClass {

	/**
	 * @param args
	 */
	private int dynamicVariable1 = 9;
	public static void main(String[] args) {
		//Om n�got �r static s� skapas det direkt 
		//Man kan inte n� s�dant som inte �r deklarerat static fr�n en static kontext
		// dynamicVariable1 = 10; //FEL det blir "Cannot make a static reference to the non-static field dynamicVariable"
		
		//S� eftersom denna main metoden �r statisk kan den inte n� dynamiska variabler som �r
		//deklarerade UTANF�R!!! men
		int dynamicVariable2 = 9;
		dynamicVariable2 = 11;
		//Men detta g�r bra eftersom den �r deklarerad inne i denna metoden och skapas
		//n�r denna metoden skapas.
	}

}
