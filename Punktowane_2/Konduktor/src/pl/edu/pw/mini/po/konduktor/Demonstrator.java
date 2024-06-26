package pl.edu.pw.mini.po.konduktor;

import java.util.TreeSet;

import pl.edu.pw.mini.po.konduktor.bilety.kasowniki.KasownikDoBiletowOffline;
import pl.edu.pw.mini.po.konduktor.bilety.kasowniki.SystemSprzedazyBiletow;
import pl.edu.pw.mini.po.konduktor.wagon.Podrozny;
import pl.edu.pw.mini.po.konduktor.wagon.Wagon;

public class Demonstrator {

	public static void main(String[] args) {
		SystemSprzedazyBiletow system = new SystemSprzedazyBiletow();
		KasownikDoBiletowOffline kasownik = new KasownikDoBiletowOffline(system);
		TreeSet<Podrozny> podrozni = new TreeSet<Podrozny>();{
			for (int i=0; i<50; i++) {
				podrozni.add(new Podrozny(system));
			}
		}
		Wagon wagon = new Wagon(podrozni);
		Konduktor konduktor = new Konduktor(kasownik, wagon);
		konduktor.go();
	}

}
