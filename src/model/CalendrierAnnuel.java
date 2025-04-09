package model;

import java.util.Arrays;

import javax.management.loading.PrivateClassLoader;

public class CalendrierAnnuel {
	private Mois[] calendrier;

	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Janvier", 31);
		calendrier[2] = new Mois("Janvier", 31);
		calendrier[3] = new Mois("Janvier", 31);
		calendrier[4] = new Mois("Janvier", 31);
		calendrier[5] = new Mois("Janvier", 31);
		calendrier[6] = new Mois("Janvier", 31);
		calendrier[7] = new Mois("Janvier", 31);
		calendrier[8] = new Mois("Janvier", 31);
		calendrier[9] = new Mois("Janvier", 31);
		calendrier[10] = new Mois("Janvier", 31);
		calendrier[11] = new Mois("Janvier", 31);

	}

	public static class Mois {
		public String nom;
		public boolean jours[];

		public Mois(int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			Arrays.fill(jours, false);
		}

		private boolean estLibre(int jour) {
			return jours[jour - 1];
		}

		private void reserver(int jour) {
			if (jour > jours.length && !estLibre(jour)) {
				throw new IllegalStateException();
			}
			jours[jour - 1] = true;
		}

	}

	}

	private boolean estLibre(int jour, int Mois) {
			return calendrier[Mois-1].estLibre(jour);
}
