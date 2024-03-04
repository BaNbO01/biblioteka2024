package biblioteka;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs  {

	private List<Knjiga> knjige = new ArrayList<>();
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		if(k==null)
			throw new NullPointerException("Knjiga ne sme biti null");
		if(knjige.contains(k))
			throw new IllegalArgumentException("Knjiga vec postoji u biblioteci");
		knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if(k==null)
			throw new NullPointerException("Knjiga ne sme biti null");
		
		if(!knjige.contains(k))
			throw new IllegalArgumentException("Knjiga vec postoji u biblioteci");
	knjige.remove(k);
		
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		if(autor==null && isbn==0 && naslov==null && izdavac==null)
			throw new IllegalArgumentException("Morate uneti bar jedan kriterujum");

		
		List<Knjiga> rezultati = new ArrayList<>();
		for (Knjiga knjiga : rezultati) {
			if(knjiga.getNaslov().toUpperCase().contains(naslov)) {
				rezultati.add(knjiga);
			}
		}
		return rezultati;
	}

	
}
