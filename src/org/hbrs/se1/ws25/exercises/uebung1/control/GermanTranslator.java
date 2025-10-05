package org.hbrs.se1.ws25.exercises.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2025"; // Default-Wert

    private static final String[] numbers = {
      "","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun","zehn"
    };



    // Wenn number außerhalb des Bereichs 1–10 ist, fliegt eine ArrayIndexOutOfBoundsException,
    // die abgefangen wird → Fehlermeldung wird zurückgegeben.
	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	 public String translateNumber(int number) {
		try{
            return numbers[number];
        } catch(ArrayIndexOutOfBoundsException e){
            return "übersetzung der Zahl: " + number +
                    "nicht möglich (Version: "+version+")";
        }
	}
    //Test 1234
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
	 * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
