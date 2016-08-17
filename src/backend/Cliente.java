package backend;

import java.util.ArrayList;

public class Cliente extends Pessoa {

		private String genero;

		public Cliente(String N, String C, String RG, String em, Endereco E, Telefone t, String g)
		{
			super(N,C,RG,em,E,t);
			genero=g;
		}

		public Cliente() {
			super();
			System.out.print("Genero: ");
			genero = ler.next();
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public void Imprime() {
			super.Imprime();
			System.out.println("Genero: " + genero+"\n");
		}

}
