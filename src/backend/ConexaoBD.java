//package backend;
import java.sql.*;
import java.util.ArrayList;

public class ConexaoBD {

	  public static Connection con=null;

		//****************ABRE CONEXAO COM O BANCO**********************************
	  private static void conectarBD(){
		String url = "jdbc:mysql://localhost:3306/Agenda";
		//String url = "jdbc:mysql://localhost:3306/Agenda2";
		String login = "root";
		String senha = "";

		try{
			con =  DriverManager.getConnection(url, login,senha);
		}
		catch( SQLException sqlE ) {
				System.out.print("SQL: Nao pode conectar ao Banco: "+sqlE);
		}
	  }

		//****************FECHA CONEXAO COM O BANCO*********************************
		private static boolean desconectarBD(){
			try {
				if (con != null) {
					con.close();
					return true;
				}
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
				System.out.println("SQL: Erro ao inserir cliente!");
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************INSERE PESSOA*********************************************
		public static boolean insere( String cpf, String nome, String rg, String email) {
			try {
				conectarBD();
				String sql = "insert into pessoa(cpf, nome, rg, email) values(?,?,?,?);";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, cpf);
				pst.setString(2, nome);
				pst.setString(3, rg);
				pst.setString(4, email);
				pst.executeUpdate();
				//System.out.println("Pessoa inserida");
				return true;
			}
			catch (SQLException erro) {
				System.out.println("SQL: Erro ao inserir Pessoa");
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************INSERE ENDERECO****************************************
		public static boolean insere( String cpf, Endereco endereco) {
			try {
				conectarBD();
				String sql = "insert into endereco(cpf_pessoa, rua, numero, complemento, bairro, cidade, uf, cep) values(?,?,?,?,?,?,?,?)";
				PreparedStatement pst = con.prepareStatement(sql);

				pst.setString( 1, cpf);
				pst.setString( 2, endereco.getRua() );
				pst.setInt( 3, endereco.getNumero() );
				pst.setString( 4, endereco.getComplemento() );
				pst.setString( 5, endereco.getBairro() );
				pst.setString( 6, endereco.getCidade() );
				pst.setString( 7, endereco.getUf() );
				pst.setString( 8, endereco.getCep() );
				pst.executeUpdate();

				return true;
			}
			catch (SQLException erro) {
				System.out.println("SQL: Erro ao inserir Endereco");
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************INSERE UM ÚNICO TELEFONE**********************************
		public static boolean insere( String cpf, Telefone telefone) {
			try {
				conectarBD();

				String sql = "insert into telefone(cpf_pessoa, numero, zap) values(?,?,?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString( 1, cpf);
				pst.setString( 2, telefone.getNumero() );
				pst.setBoolean( 3, telefone.isZap() );
				pst.executeUpdate();

				//System.out.println("Telefone " + telefone.getNumero() + " inserido com sucesso!");
				return true;
			}
			catch (SQLException erro) {
				System.out.println("SQL: Erro ao inserir Telefone -> " + telefone.getNumero() );
				return false;
			}
			finally{
				desconectarBD();
			}
		}

		//****************INSERE VARIOS TELEFONES***********************************
		public static boolean insere( String cpf, ArrayList<Telefone> telefones) {
			for (Telefone tel : telefones) {
				insere(cpf, tel);
			}

			//System.out.println("Telefones inseridos com sucesso!");
			return true;
		}

		//****************ENCONTRA CARGO********************************************
		public static int CodigoCargo( String nomeCargo) {
			try {
				conectarBD();

				String sql = "select * from cargo;";
				//PreparedStatement pst = con.prepareStatement(sql);
				//pst.setString( 1, nomeCargo );
				//ResultSet rs = pst.executeQuery();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				while ( rs.next() ) {
					if (nomeCargo == rs.getString("nome") ){
						String cargo = rs.getString("codigo");
						int codigoCargo = Integer.parseInt(cargo);
						System.out.println("Cargo " + nomeCargo + " codigo: " + codigoCargo);
						return codigoCargo;
					}
				}
				return (-1);
			}
			catch (SQLException erro) {
				System.out.println("SQL: Erro ao procurar cargo");
				return (-1);
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
				insere( pessoa.getCpf(), pessoa.getNome(), pessoa.getRg(), pessoa.getEmail() );
				//****************Inserir Endereco**************************************
				insere( pessoa.getCpf(), pessoa.getEnde() );
				//****************Inserir Telefone**************************************
				insere( pessoa.getCpf(), pessoa.getTel() );
				//****************Encontrando o cargo do funcionario********************
				int cargo = CodigoCargo( pessoa.getCargo() );
				//****************Inserir Funcionario***********************************
				if (cargo != -1) {
					String sql = "insert into funcionario(cpf_pessoa, senha, cargo, nivel) valeus("+pessoa.getCpf()+",123456"+cargo+","+pessoa.getNivel()+")";
					Statement stmt = con.createStatement();
					stmt.executeUpdate(sql);
					System.out.println("Funcionario inserido com sucesso!");
					return true;
				}
				else {
					System.out.println("Falha ao inserir Funcionario!");
					return false;
				}
			}
			catch (SQLException erro) {
				System.out.println("SQL: Erro ao inserir funcionario");
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
