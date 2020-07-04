package com.barhoum.entitees;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	@Entity
	public class Utilisateur implements Serializable{

		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column(length=70)
		private String login;
		private  String pasword;
		private String adress;
		
		public Utilisateur(String login, String pasword, String adress) {
			super();
			this.login = login;
			this.pasword = pasword;
			this.adress = adress;
		}
		public Utilisateur() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPasword() {
			return pasword;
		}
		public void setPasword(String pasword) {
			this.pasword = pasword;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}

		

}
