package de.hs_lu.o2s.ueb.ue8.huehner;

// Aufgabe 1
public class AppTestMyArrayList {

	public static void main(String[] args) {
		MyArrayList<Henne> myAL = new MyArrayList<Henne>();
		//  neue Henne ezeugen
		Henne anna = new Henne("Anna");
		Henne emma = new Henne("Emma");
		Henne irma = new Henne("Irma");
		Henne erna = new Henne("Erna");
		
		// Henne in myAL hinzufuegen 
		myAL.add(anna);
		myAL.add(emma);
		myAL.add(irma);
		myAL.add(2, erna);
		
		System.out.println(myAL);
		
		// remove methode 
		try {
			myAL.remove(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(myAL);
		
		//myAL.remove(erna);
		
//		
//		try {
//			myAL.remove(5);
//		} catch (Exception e)  {
//			e.printStackTrace();
//		}
//		
		
		// clear myAl
		myAL.clear();
	}

}
