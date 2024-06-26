package pl.edu.pw.mini.po.konduktor.bilety.kasowniki;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.konduktor.bilety.Bilet;
import pl.edu.pw.mini.po.konduktor.bilety.Imie;
import pl.edu.pw.mini.po.konduktor.bilety.Nazwisko;
import pl.edu.pw.mini.po.konduktor.bilety.Relacja;
import pl.edu.pw.mini.po.konduktor.wagon.Stolik;
import pl.edu.pw.mini.po.konduktor.wagon.Wagon;

public class SystemSprzedazyBiletow{

	private static final Random random = new Random();
	
	private Set<Bilet> sprzedaneBilety;
	
	public SystemSprzedazyBiletow() {
		this.sprzedaneBilety = new LinkedHashSet<Bilet>();
	}

	public Bilet sprzedajBilet(Imie imie, Nazwisko nazwisko, Relacja relacja) {
		Stolik stolik = Stolik.values()[random.nextInt(Wagon.getLiczbaStolikow())];
		Bilet bilet = new Bilet(imie, nazwisko, relacja, stolik, false);
		sprzedaneBilety.add(bilet);
		return bilet;
	}
	
	public boolean zweryfikujBilet(Bilet bilet) {
		if (sprzedaneBilety.contains(bilet)) {
			bilet.skasuj();
			return true;
		}
		return false;
	}
	
	public Set<Bilet> getSprzedaneBilety() {
		return sprzedaneBilety;
	}
	
}
