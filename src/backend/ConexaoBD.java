package backend;
import java.sql.*;

public class ConexaoBD {

	  public static Connection con=null;

		//****************ABRE CONEXAO COM O BANCO**********************************
	  public void conectarBD(){
		String url = "jdbc:mysql://localhost:3306/Agenda";
		String login = "Agenda";
		String senha = "ifnmg@2016";

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
		public static boolean insere( Cliente cliente) {
			conectarBD();
			String sql = "insert into cliente(cpf, nome, rg, email, genero) values(?,?,?,?,?);";

			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, cliente.getCpf());
				pst.setString(2, cliente.getNome());
				pst.setString(3, cliente.getRg());
				pst.setString(4, cliente.getEmail());
				pst.setString(5, cliente.getEmail());
				System.out.println("Inserido com sucesso");
				return true;
			}
			catch (SQLException erro) {
				System.out.println("Erro ao inserir!");
				return false;
			}

			desconectarBD();
		}

		//****************INSERE FUNCIONARIO****************************************
		public static boolean insere( Funcionario funcionario) {

		}

		//****************UPDATE****************************************************

		//****************DELETE****************************************************


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
