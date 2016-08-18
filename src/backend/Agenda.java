//package backend;

public class Agenda {
	private Pessoa p;
	private Funcionario f;
	private Telefone tele;
	private Cliente c;
	private Endereco e;
	private Servico s;
	private TipoServico ts;

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	public Funcionario getF() {
		return f;
	}

	public void setF(Funcionario f) {
		this.f = f;
	}

	public Telefone getTele() {
		return tele;
	}

	public void setTele(Telefone tele) {
		this.tele = tele;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public Endereco getE() {
		return e;
	}

	public void setE(Endereco e) {
		this.e = e;
	}

	public Servico getS() {
		return s;
	}

	public void setS(Servico s) {
		this.s = s;
	}

	public TipoServico getTs() {
		return ts;
	}

	public void setTs(TipoServico ts) {
		this.ts = ts;
	}

}
