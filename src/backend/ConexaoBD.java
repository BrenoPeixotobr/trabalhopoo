package backend;
import java.sql.*;

public class ConexaoBD {
	
	  public static Connection con=null;
	  //*******************************************
	  public void conectarBD(){
		String url = "jdbc:mysql://localhost:3306/Agenda";
		String login = "Agenda";
		String senha = "ifnmg@2016";
		
			try{
				con =  DriverManager.getConnection(url, login,senha);
				
			}catch(SQLException sqlE){
				System.out.print("Nao pode conectar ao Banco: "+sqlE);
				
			}

	  }
	  
	  
	  public static void insere(String nome, int CPF, String rg, String email) {
		  int linhasAfetadas = 0;
			try{
			Statement st = con.createStatement();
			String sql = "insert into pessoa(cpf, nome, rg, email) values('"+CPF+"','"+nome+"','"+rg+"','"+email+"');";
			linhasAfetadas = st.executeUpdate(sql);
			
			}catch(SQLException fonte){
				System.out.println("Não pode conectar com a fonte : "+fonte);	   
			}finally {
			     try   
		         {  
		            con.close();  
		         }  
		         catch(SQLException onConClose)  
		         {  
		             System.out.println("Houve erro no fechamento da conexão");  
		             onConClose.printStackTrace(); 

		         }
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
