package backend;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	  private int matricula;
	  private String cargo;
	  
	  public Funcionario(String N, String C, String RG, String em, Endereco E,ArrayList<Telefone> t, String car)
		{
		  super(N,C,RG,em,E,t);
		  cargo=car;
		}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



}
