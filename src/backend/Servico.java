package backend;

import java.security.Timestamp;
import java.sql.Time;

import javax.xml.crypto.Data;

public class Servico {
	 	private TipoServico tipo;
	  private Cliente cliente;
	  private Funcionario funcionario;
	  private boolean pago;
	  private Data dataser;
	  private Time hora;

	public TipoServico getTipo() {
		return tipo;
	}
	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public Data getDataser() {
		return dataser;
	}
	public void setDataser(Data dataser) {
		this.dataser = dataser;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}

}
