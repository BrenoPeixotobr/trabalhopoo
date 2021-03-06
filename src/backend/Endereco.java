//package backend;
import java.util.Scanner;

public class Endereco {
	private String rua, complemento, bairro, cidade, cep, uf;
	private int numero;
	private Scanner ler = new Scanner(System.in);

	public Endereco(String r, String c, int n, String b, String cid,String CEP, String Uf){
		rua = r;
		complemento = c;
		numero = n;
		bairro = b;
		cidade = cid;
		cep = CEP;
		uf = Uf;
	}

	public Endereco() {
		System.out.print("Rua: ");
		this.rua = ler.nextLine();
		System.out.print("Numero: ");
		this.numero = ler.nextInt();
		ler.nextLine();
		System.out.print("Complemento: ");
		this.complemento = ler.nextLine();
		System.out.print("Bairro: ");
		this.bairro = ler.nextLine();
		System.out.print("Cidade: ");
		this.cidade = ler.nextLine();
		System.out.print("Estado: ");
		this.uf = ler.nextLine();
		System.out.print("CEP: ");
		cep = ler.nextLine();
		//ler.nextLine();
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void Imprime() {
		//System.out.println("\nRua: "+rua+"\nNumero: "+numero+"\nComplemento: "+complemento+"\nBairro: "+bairro+"\nCidade: "+cidade+"\nEstado: "+uf);
		System.out.println("\nEndereco: Rua "+rua+", "+numero+" ("+complemento+")"+", "+bairro+" - "+cidade+"/"+uf+"\nCEP: " + cep);
	}

}
