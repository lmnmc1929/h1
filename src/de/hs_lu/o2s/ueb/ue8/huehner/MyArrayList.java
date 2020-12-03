package de.hs_lu.o2s.ueb.ue8.huehner;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
	
	
	// Object am Ende addieren
	@Override
	public boolean add(E e) {
		boolean ergebnis = super.add(e);
		String str = "";
		
			str += "Fuege "+ e.toString()+" in die Liste an Position"+this.indexOf(e)+"ein."
					+"Neue Listenlaenge: " + this.size()+"\n";
			
			str += "Elemente der Liste : \n" ;
			for (int i = 0; i < this.size(); i++) {
				str += this.get(i).toString();
			}
			
			System.out.println(str);
			
		
		return ergebnis;
	}
	
	// Object an gebebene Position addieren
	@Override
	public void add(int index, E e) {
		super.add(index, e);
		String str = "";
		str += "Fuege "+ e+" in die Liste an Position"+this.indexOf(e)+"ein."
				+"Neue Listenlaenge: " + this.size()+"\n";
		
		str += "Elemente der Liste : \n" ;
		
		for (int i = 0; i < this.size(); i++) {
			str += this.get(i).toString();
		}
		
		System.out.println(str);
	}
	
	// Remove ein Element mit gebenen Position
	@Override
	public E remove(int index){
		System.out.println("Entferne "+this.get(index)+" aus Liste an bisheriger Position"+index);
		return super.remove(index) ;
	}
	
	// Remove ein Element normales 
	@Override
	public boolean remove(E obj){
		System.out.println("Entferne "+obj+" aus Liste an bisheriger Position"+this.indexOf(obj));
		
	
		return super.remove(obj);
	}
	
	// method zu leeren die Liste
	@Override
	public void clear() {
		super.clear();
		System.out.println("Leere Liste mit Laenge "+this.size());
	} 
}
