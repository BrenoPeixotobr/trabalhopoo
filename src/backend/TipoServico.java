//package backend;

import java.sql.Time;

public class TipoServico {
	  private String nomeServico;
	  private float valor;
	  private float desconto=0;
	  private int duracao; // em minutos
	  private Time durcacao;

	  public TipoServico (){
	    System.out.println("Criou tipo servico");
	  }

	  public TipoServico (String n, float v, int d){
		    nomeServico = n;
		    valor = v;
		    duracao = d;
		    System.out.println("Criou tipo servico");
		  }

	  public void teste(){
	    System.out.println("Criou tipo servico");
	  }

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Time getDurcacao() {
		return durcacao;
	}

	public void setDurcacao(Time durcacao) {
		this.durcacao = durcacao;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}



}
