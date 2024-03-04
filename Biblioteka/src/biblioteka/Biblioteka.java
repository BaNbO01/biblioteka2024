package biblioteka;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs  {

	private List<Knjiga> knjige = new ArrayList<>();
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
	knjige.remove(k);
		
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		if(naslov==null && autor==null && isbn==0 && izdavac==null)
			return null;
		List<Knjiga> rezultati = new ArrayList<>();
		for (Knjiga knjiga : rezultati) {
			if(knjiga.getNaslov().toUpperCase().contains(naslov)) {
				rezultati.add(knjiga);
			}
		}
		return rezultati;
	}

	
}
