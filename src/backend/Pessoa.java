package backend;

import java.util.ArrayList;

public class Pessoa {
	protected String cpf;
	protected String nome;
	protected String rg;
	protected String email;
	protected Endereco ende;
	
	protected  ArrayList<Telefone> tel;
	
	public Pessoa(String N, String C, String RG, String em, Endereco E,ArrayList<Telefone> t){
		nome=N;
		cpf=C;
		rg=RG;
		email=em;
		ende=E;
		tel=t;		
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

}
