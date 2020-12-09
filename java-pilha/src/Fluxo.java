public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(Exception ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception - " + msg);
        	ex.printStackTrace(); // printStackTrace - imprimir o rastro onde o metodo passou.
        }	
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        /*for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try { // try - tenta executar este codigo abaixo.
            int a = i / 0; // codigo com erro.
            } catch(ArithmeticException ex) { // catch - pega essa exceção caso tenha erro e execute abaixo
            	System.out.println("ArithmeticException"); // a execução aconteceu normalmente.
        	}
//            Conta c = null;
//            c.deposita();
        }*/
        
        //ArithmeticException ex = new ArithmeticException("deu errado"); // criando uma exceção(bomba) para ser colocado na pilha;
        //throw ex; //  jogar a exceção na pilha, então neste método tem uma bomba na pilha. Quando isso acontece o condigo é interrompido. 
        // pode ser escrito conforme acima ou abaixo;
        
        throw new MinhaExcecao("Deu muito errado!");          
        
        //System.out.println("Fim do metodo2");
    }
}