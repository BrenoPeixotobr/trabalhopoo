package backend;

public class Funcionario extends Pessoa {
	  private int matricula;
	  private String cargo;
	  
	  public Funcionario()
		{
			super();
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
