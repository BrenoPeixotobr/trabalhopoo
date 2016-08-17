package backend;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
  private int matricula;
  private String cargo;

  public Funcionario(String N, String C, String RG, String em, Endereco E, Telefone t, int mat, String car)
	{
	  super(N,C,RG,em,E,t);
		matricula = mat;
	  cargo=car;
	}

	public Funcionario(){
		super();
		System.out.print("Matricula: ");
		matricula = ler.nextInt();
		System.out.print("Cargo: ");
		cargo = ler.next();
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

	public void Imprime() {
		super.Imprime();
		System.out.println("Matricula: "+matricula+"\nCargo: "+cargo);
	}

}
