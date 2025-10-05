package org.hbrs.se1.ws25.exercises.uebung1.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*
Design Pattern:	Factory Method Pattern
Ziel:	Entkopplung von Objekt-Erzeugung und Objekt-Nutzung
Vorteil:	Der Client kennt nur das Interface Translator und nicht die konkrete Klasse.
            Damit wird der Code leicht erweiterbar (z. B. später EnglishTranslator).
 */
public class TranslatorFactory {
    public static Translator createGermanTranslator() {
        GermanTranslator translator = new GermanTranslator();
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM/yyyy"));
        translator.setDate(date);
        return translator;
    }
}
