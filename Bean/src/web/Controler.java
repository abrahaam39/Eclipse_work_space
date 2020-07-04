package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Calcul;
import metier.Icalcul;


@WebServlet("/Controler")
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Icalcul metier;
    public void ini() {
    	Calcul metier = new Calcul();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setAttribute("modele",new Modelcalcul(0,0,0,0,0)) ;
		request.getRequestDispatcher("calcul.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calcul metier = new Calcul();
		Modelcalcul modele = new Modelcalcul();
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double somme = metier.addition(a,b);
		double soust = metier.soust(a,b);
		double produit = metier.produit(a,b);
		modele.setA(a);
		modele.setB(b);
		modele.setSomme(somme);
		modele.setProduit(produit);
		modele.setSous(soust);
		request.setAttribute("modele", modele);
		request.getRequestDispatcher("calcul.jsp").forward(request, response);
		
}
}