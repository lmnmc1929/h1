package de.hs_lu.o2s.ueb.ue8.huehner;

import java.util.HashMap;

//Aufgabe 2
public class AppTestHashMap {

	public static void main(String[] args) {
		
		HashMap myHM = new HashMap();
		/* teil a*/
		//  neue Henne ezeugen
		Henne anna = new Henne("Anna");
		Henne emma = new Henne("Emma");
		Henne irma = new Henne("Irma");
		Henne erna = new Henne("Erna");
		
		// Henne hinzufuegen 
		myHM.put( "Anna",anna);
		myHM.put( "Emma",emma);
		myHM.put( "Irma",irma);
		myHM.put("Erna",erna);
		
		// henne ausdrücken 
		System.out.println();
		for(Object key : myHM.keySet()) {
			System.out.println(key + "=" +myHM.get(key))	;	
		}
		
		// check Ei und ausgeben
		if(irma.checkEi()) {
			System.out.println("Irma hat ein Ei");
		}else {
			System.out.println("Irma hat kein Ei");
		}
		
		// teil b 
		HashMap<String, Henne> myHMGen = new HashMap<String, Henne>();
		
		//myHMGen.put("Anna", new Ei("braun", 54.0)); // Fehler – Value falscher Typ
		//myHMGen.put(10, new Henne("Anna")); // Fehler – Key falscher Typ
		myHMGen.put( "Anna",anna);
		myHMGen.put( "Emma",emma);
		myHMGen.put( "Irma",irma);
		myHMGen.put("Erna",erna);
		
		System.out.println();
		for(Object key : myHMGen.keySet()) {
			System.out.println("Schluessel :"+key + "-"+"zugeordnete Wert : " +myHMGen.get(key))	;	
		}
	}

}
