package backend;

import java.util.ArrayList;

public class Cliente extends Pessoa {
		
		private String genero;
		protected String cpf;
		protected String nome;
		protected String rg;
		protected String email;
		protected Endereco ende;
		
		protected  ArrayList<Telefone> tel;
		
		public Cliente(String N, String C, String RG, String em, Endereco E,ArrayList<Telefone> t, String g)
		{
			super(N,C,RG,em,E,t);
			genero=g;
		}
		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		}
