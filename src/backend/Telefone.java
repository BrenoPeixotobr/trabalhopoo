package backend;
import java.util.Scanner;

public class Telefone {

  private String numero;
  private boolean zap;
  private static Scanner ler = new Scanner(System.in);

	public  Telefone( String num, boolean wpp) {
		numero = num;
		zap = wpp;
	}

	public Telefone() {
		System.out.print("Telefone: ");
		numero = ler.next();
		ler.nextLine();
		System.out.print("E whatsapp? (s para sim ou qq coisa para nao): ");
		char wpp = ler.next().charAt(0);
		//System.out.println("vc digitou: " + wpp);
		if (wpp == 's' || wpp == 'S'){
			zap = true;
		}
		else {
			zap = false;
		}
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

	public void Imprime(){
		System.out.println("Numero: " + this.getNumero());
		if (this.isZap() == true) {
			System.out.println("E whatsapp!");
		}
		else {
			System.out.println("Nao eh whatsapp!");
		}
	}

}

