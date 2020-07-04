package web;

import java.io.Serializable;

public class Modelcalcul implements Serializable{
	
		private double a;
		private double b;
		private double somme;
		private double sous;
		private double produit;
		public Modelcalcul() {
			super();
			
		}
		public double getA() {
			return a;
		}
		public double getB() {
			return b;
		}
		public double getSomme() {
			return somme;
		}
		public double getSous() {
			return sous;
		}
		public double getProduit() {
			return produit;
		}
		public void setA(double a) {
			this.a = a;
		}
		public void setB(double b) {
			this.b = b;
		}
		public void setSomme(double somme) {
			this.somme = somme;
		}
		public void setSous(double sous) {
			this.sous = sous;
		}
		public void setProduit(double produit) {
			this.produit = produit;
		}
		public Modelcalcul(double a, double b, double somme, double sous, double produit) {
			super();
			this.a = a;
			this.b = b;
			this.somme = somme;
			this.sous = sous;
			this.produit = produit;
		}
		
}
