package backend;
import java.sql.*;

public class ConexaoBD {

	  public static Connection con=null;

		//****************ABRE CONEXAO COM O BANCO**********************************
	  public static void conectarBD(){
		String url = "jdbc:mysql://localhost:3306/Agenda";
		//String url = "jdbc:mysql://localhost:3306/Agenda2";
		String login = "root";
		String senha = "";

		try{
			con =  DriverManager.getConnection(url, login,senha);
		}
		catch( SQLException sqlE ) {
				System.out.print("Nao pode conectar ao Banco: "+sqlE);
		}
	  }

		//****************FECHA CONEXAO COM O BANCO*********************************
		public static boolean desconectarBD(){
			try {
				con.close();
				return true;
			}
			catch( SQLException onConClose ) {
				System.out.println("Houve erro no fechamento da conexão");
				onConClose.printStackTrace();
				return false;
			}
  	}

		//****************INSERE CLIENTE********************************************
		public static boolean insere( Cliente pessoa) {
			try {
				conectarBD();
				String sql = "insert into cliente(cpf, nome, rg, email, genero) values(?,?,?,?,?);";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, pessoa.getCpf());
				pst.setString(2, pessoa.getNome());
				pst.setString(3, pessoa.getRg());
				pst.setString(4, pessoa.getEmail());
				pst.setString(5, pessoa.getEmail());
				System.out.println("cliente " + pessoa.getNome() + " inserido com sucesso");
				return true;
			}
			catch (SQLException erro) {
				System.out.println("Erro ao inserir cliente!");
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************INSERE FUNCIONARIO****************************************
		public static boolean insere( Funcionario pessoa) {
			try {
				conectarBD();
				//****************Inserir Pessoa****************************************
				String sql = "insert into pessoa(cpf, nome, rg, email) values("+pessoa.getCpf()+","+pessoa.getNome()+","+pessoa.getRg()+","+pessoa.getEmail()+");";
				Statement stmt = con.createStatement();
				stmt.executeUpdate(sql);
				//****************Inserir Endereco**************************************
				Endereco endereco = pessoa.getEnde();
				String rua = endereco.getRua();
				int numero = endereco.getNumero();
				String complemento = endereco.getComplemento();
				String bairro = endereco.getBairro();
				String cidade = endereco.getCidade();
				String estado = endereco.getUf();
				String cpf = endereco.getCep();
				sql = "insert into endereco(cpf_pessoa, rua, numero, complemento, bairro, cidade, uf, cep) values("+pessoa.getCpf()+","+rua+","+numero+","+complemento+","+bairro+","+cidade+","+estado+");";
				stmt.executeUpdate(sql);
				//****************Inserir Telefone**************************************
				for (Telefone tel : pessoa.getTel()){
					sql = "insert into telefone(cpf_pessoa, numero, zap) values("+pessoa.getCpf()+","+tel.getNumero()+","+tel.isZap()+");";
					stmt.executeUpdate(sql);
				}
				//****************Inserir Funcionario***********************************
				//*****Encontrando o cargo do funcionario*******************************
				sql = "select * from cargo where nome = " + pessoa.getCargo() + ";";
				 ResultSet rs = stmt.executeQuery(sql);
				 String c = rs.getString("cargo");
				 int cargo = Integer.parseInt(c);
				sql = "insert into funcionario(cpf_pessoa, senha, cargo, nivel) valeus("+pessoa.getCpf()+",123456"+cargo+","+pessoa.getNivel()+")";

				System.out.println("Funcionario inserido com sucesso!");
				return true;
			}
			catch (SQLException erro) {
				System.out.println("Erro ao inserir funcionario");
				return false;
			}
			finally{
				desconectarBD();
			}
		}
/*
		//****************UPDATE FUNCIONARIO****************************************
		public static boolean update( Funcionario funcionario) throws SQLException {
			try {
				conectarBD();
				String sql = ";";

				System.out.println("Funcionario atualizado com sucesso!");
				return true;
			}
			catch (SQLException erro) {
				System.out.println( "Erro ao atualizar funcionario" );
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************UPDATE CLIENTE********************************************
		public static boolean update( Cliente cliente) {
			try {
				conectarBD();
				String sql = ";";

				System.out.println( "Cliente atualizado com sucesso!" );
				return true;
			}
			catch(SQLException erro) {
				System.out.println( "Erro ao atualizar cliente" );
				return false;
			}
			finally{
				desconectarBD();
			}
		}
*/

		//****************DELETE FUNCIONARIO****************************************
		public static boolean delete( Funcionario pessoa) {
			try {
				conectarBD();
				String nome = pessoa.getNome();
				Statement stmt = con.createStatement();
				//*************Deletar Telefones****************************************
				String sql = "delete from telefone where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//*************Deletar o Endereço***************************************
				sql = "delete from endereco where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//*************Deletar o funcionario************************************
				sql = "delete from cliente where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//*************Deletar a Pessoa*****************************************
				sql = "delete from pessoa where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//**********************************************************************
				System.out.println( "Funcionario " + nome + " excluido com sucesso!" );
				return true;
			}
			catch (SQLException erro) {
				System.out.println( "Erro ao excluir funcionario" );
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************DELETE CLIENTE********************************************
		public static boolean delete( Cliente pessoa) {
			try {
				conectarBD();
				Statement stmt = con.createStatement();
				String nome = pessoa.getNome();
				//*************Deletar Telefones****************************************
				String sql = "delete from telefone where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//*************Deletar o Endereço***************************************
				sql = "delete from endereco where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//*************Deletar o Cliente****************************************
				sql = "delete from cliente where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//*************Deletar a Pessoa*****************************************
				sql = "delete from pessoa where cpf = "+ pessoa.getCpf() + ";";
				stmt.executeUpdate(sql);
				//**********************************************************************
				System.out.println( "Cliente " + nome + " excluido com sucesso!" );
				return true;
			}
			catch (SQLException erro) {
				System.out.println( "Erro ao excluir cliente" );
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************insere pessoa*********************************************
	  public static void insere(String nome, int CPF, String rg, String email) {
		  int linhasAfetadas = 0;
			try{
			Statement st = con.createStatement();
			String sql = "insert into pessoa(cpf, nome, rg, email) values('"+CPF+"','"+nome+"','"+rg+"','"+email+"');";
			linhasAfetadas = st.executeUpdate(sql);

			}catch(SQLException fonte){
				System.out.println("Não pode conectar com a fonte : "+fonte);
			}finally {
			     desconectarBD();
			}
	 }

}
