package web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import metier.Prixdouble;



	@WebServlet("/Controleur")
	public class Controleur extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setAttribute("modele",new Produit("","",0,0)); 	
	      request.getRequestDispatcher("vue.jsp").forward(request, response);
	    }
	   
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      
		    
	    
	    Produit Prod = new Produit();
	    Prod.setNom(request.getParameter("nom"));
	    Prod.setPrenom(request.getParameter("prenom"));
	    int prix = Integer.parseInt(request.getParameter("prix"));
	    Prod.setPrix(prix);
	    int prix2 = prix * 2;
	    Prod.setPrix2(prix2);
	    request.setAttribute("modele", Prod);
	    request.getRequestDispatcher("vue.jsp").forward(request, response);

	}

	}



