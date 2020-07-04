package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CreditImp;
import dao.Icredit;


@WebServlet("/Controler")
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Icredit metier;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	CreditModel modele = new CreditModel(0,0,0,0);	
	request.setAttribute("modele", modele);
	 request.getRequestDispatcher("credit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CreditImp metier = new CreditImp();

		double montant = Double.parseDouble(request.getParameter("montant"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		double duree = Double.parseDouble(request.getParameter("duree"));
		double mensualite = metier.calculcredit(montant, duree, taux);
		CreditModel modele = new CreditModel(montant,duree,taux,mensualite);
	    request.setAttribute("modele", modele);
		request.getRequestDispatcher("credit.jsp").forward(request, response);
		doGet(request, response);
	}

}
