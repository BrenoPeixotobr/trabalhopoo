package backend;
import java.sql.*;

public class ConexaoBD {
	
	  public static Connection con=null;
	  //*******************************************
	  public void conectarBD(){
		String url = "jdbc:mysql://localhost:3306/BDescola";
		String login = "root";
		String senha = "";
		
			try{
				con =  DriverManager.getConnection(url, login,senha);
				
			}catch(SQLException sqlE){
				System.out.print("Nao pode conectar ao Banco: "+sqlE);
				
			}

	  }
	  
	  
	  //******************************
	  public int fecharConexao(){
		try{
			con.close();
			return 1;
		}catch(SQLException sqlE){
			System.out.println("Houve erro no fechamento da conexão");
			return 0;
		}
	  }

}
