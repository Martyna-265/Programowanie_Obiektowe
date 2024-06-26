package pl.edu.pw.mini.po.przejscie_graniczne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import pl.edu.pw.mini.po.przejscie_graniczne.kontrola.Areszt;
import pl.edu.pw.mini.po.przejscie_graniczne.kontrola.Celnik;
import pl.edu.pw.mini.po.przejscie_graniczne.kontrola.NieletniException;
import pl.edu.pw.mini.po.przejscie_graniczne.podrozni.Podrozny;
import pl.edu.pw.mini.po.przejscie_graniczne.podrozni.Turysta;
import pl.edu.pw.mini.po.przejscie_graniczne.podrozni.uzbrojeni.Przemytnik;
import pl.edu.pw.mini.po.przejscie_graniczne.podrozni.uzbrojeni.Szpieg;

public class PrzejscieGraniczne {

	private static final Random random = new Random();
	
	private List<Podrozny> podrozni;
	private List<Celnik> celnicy;
	public Areszt areszt;

	public PrzejscieGraniczne() {
		this.podrozni = new LinkedList<Podrozny>();
		this.celnicy = new ArrayList<Celnik>();
		this.areszt = new Areszt();
		
		int i = 0;
		while (i < 50) {
			podrozni.add(new Turysta(i));
			i++;
		}
		while (i < 100) {
			podrozni.add(new Przemytnik(i));
			i++;
		}
		while (i < 150) {
			podrozni.add(new Szpieg(i));
			i++;
		}
		Collections.shuffle(podrozni);
		
		for (int j = 0; j < 5; j++) {
			celnicy.add(new Celnik(areszt, podrozni));
		}
	}
	
	public void doJob() {
		Iterator<Podrozny> iterator = podrozni.iterator();
		//for (Podrozny podrozny : podrozni) {
		while (iterator.hasNext()) {
			Celnik celnik = celnicy.get(random.nextInt(celnicy.size()));
			try {
				celnik.control(iterator.next());
			} catch (NieletniException e) {
				e.printStackTrace();
			}
			//podrozni.remove(podrozny);
			iterator.remove();
		}
	}
	
}
