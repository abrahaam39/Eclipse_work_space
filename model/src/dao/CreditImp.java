package dao;

public class CreditImp implements Icredit {

	@Override
	public double calculcredit(double montant, double duree, double taux) {

		return (taux*montant)/(duree*2);
	}

}
