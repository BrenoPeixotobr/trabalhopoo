//package backend;
import java.util.Scanner;
import java.util.ArrayList;

public class Pessoa {
	protected String cpf, nome, rg, email;
	Endereco ende;
	protected Scanner ler = new Scanner(System.in);
	protected  ArrayList<Telefone> tel = new ArrayList<Telefone>();

	public Pessoa(String N, String C, String RG, String em, Endereco E, ArrayList<Telefone> t){
		nome=N;
		cpf=C;
		rg=RG;
		email=em;
		ende=E;
		tel = t;
	}

	public Pessoa () {
		System.out.print("Nome: ");
		nome = ler.nextLine();
		System.out.print("CPF: ");
		cpf = ler.nextLine();
		System.out.print("RG: ");
		rg = ler.nextLine();
		System.out.print("E-mail: ");
		email = ler.next();
		ende = new Endereco();
		Telefone t = new Telefone();
		tel.add(t);
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEnde() {
		return ende;
	}
	public void setEnde(Endereco ende) {
		this.ende = ende;
	}
	public ArrayList<Telefone> getTel() {
		return tel;
	}
	public void setTel(ArrayList<Telefone> tel) {
		this.tel = tel;
	}

	public void Imprime() {
		System.out.print("\nNome: "+nome+"\nCPF: "+cpf+"\nRG: "+rg);
		ende.Imprime();
		System.out.print("Telefone(s):");
		for (Telefone t : tel){
			t.Imprime();
		}
	}

}
