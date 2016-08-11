package backend;

public class Endereco {
	private String rua;
	private String complento;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep; 
	private String uf;
	
	public Endereco(String r, String c, int n, String b, String cid,String CEP, String Uf){
		rua=r;
		complento=c;
		numero=n;
		bairro=b;
		cidade=cid;
		cep=CEP;
		uf=Uf;		
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplento() {
		return complento;
	}
	public void setComplento(String complento) {
		this.complento = complento;
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

}
