package backend;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
  private int matricula;
  private String cargo;
  private int nivel;

  public Funcionario(String N, String C, String RG, String em, Endereco E, ArrayList<Telefone> t, int mat, String car, int n)
	{
	  super(N,C,RG,em,E,t);
		matricula = mat;
	  cargo = car;
    nivel = n;
	}

	public Funcionario(){
		super();
		System.out.print("Matricula: ");
		matricula = ler.nextInt();
    ler.nextLine();
		System.out.print("Cargo: ");
		cargo = ler.nextLine();
	}

  public int getNivel(){
    return nivel;
  }

  public void setNivel(int n){
    nivel = n;
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
