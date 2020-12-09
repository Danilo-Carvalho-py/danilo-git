
public class TesteConexao {

	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		//====================================
		
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//			//con.fecha(); // invez de fechar a conexao em TRY e repetir esse codigo em CATCH podemos colocar FINALLY
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//			//con.fecha();
//		} finally { // bloco opcional e sempre escutado com ou sem erro.
//			con.close();
//		}
//
		}

}
