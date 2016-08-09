package backend;
import java.util.Scanner;

public class Telefone {
	
	  private String numero;
	  private boolean zap;
	  private Scanner ler = new Scanner(System.in);

	  
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isZap() {
		return zap;
	}

	public void setZap(boolean zap) {
		this.zap = zap;
	}

	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}

}
