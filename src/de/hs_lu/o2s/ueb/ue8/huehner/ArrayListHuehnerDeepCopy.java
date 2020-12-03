package de.hs_lu.o2s.ueb.ue8.huehner;

import java.util.ArrayList;
import java.util.Iterator;

// Aufgabe 3
public class ArrayListHuehnerDeepCopy extends ArrayList<Henne> {

	public String toString() {
		String str = "";
		
		for(Henne h: this) {
			str += h.toString() + "\n";
		}
		
		return str;
	}

	// in dieser Klasse muessen Sie die clone-Methode ueberschreiben
	@Override
	public ArrayListHuehnerDeepCopy clone() {
		ArrayListHuehnerDeepCopy newAL = new ArrayListHuehnerDeepCopy();
		Iterator<Henne> iter = this.iterator();
		while(iter.hasNext()) {
			Henne h1 = iter.next();
			Henne copH1 = new Henne(h1.getName(),h1.getEi());
			newAL.add(copH1);
		}
		return newAL;
	}
	
}
