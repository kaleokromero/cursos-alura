
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try(Conexao con = new Conexao() ){
			con.leDados();
		 }   catch(IllegalStateException ex) {
			  System.out.println("Erro de conexão"); 
		  }
	 
	 
  }
	
}
