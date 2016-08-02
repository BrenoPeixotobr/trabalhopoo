package backend;
import java.util.Scanner;

public class Telefone {
	
	  private String numero;
	  private boolean zap;
	  private Scanner ler = new Scanner(System.in);

	  public Telefone(String n, boolean wpp) {
	    numero = n;
	    zap = wpp;
	  }

	  public Telefone () {
	    String wpp;
	    System.out.print("Numero: ");
	    numero = ler.nextLine();
	    System.out.print("Whatsapp? (S ou N)");
	    do {
	      wpp = ler.nextLine();
	      if(wpp == "S" || wpp == "s")
	        zap = true;
	      else if(wpp == "N" || wpp == "n")
	        zap = false;
	    } while(wpp != "S" && wpp != "s" && wpp != "N" && wpp != "n");
	  }

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
