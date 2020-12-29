package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class TesteDoAvaliador {

	// jUnit - fremeWork de teste de unidades, ajuda na parte 3 de validação. 
	// se tudo deu certo pinta a tela de verde ou vermelho errado
	// para configurar o jUnit funcine precisamos mudar assinatura tipo: tirar o "static" e os argumento do main().
	// assinatura para jUnit fica: public void main(){ }
	// deve ser anotado com @Test
	// Na parte 3, utilizaremos a classe Assert
	
	@Test
	public void deveEntenderLanceEmOrdemCrescente() {
		// parte 1: cenario
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("PlaySatation 3 novo");
		
		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(jose, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		
		// parte 2: acao
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		// parte 3: validacao
		double maiorEsperado = 400;
		double menorEsperador = 250;
		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		
		assertEquals(menorEsperador, leiloeiro.getMenorLance(), 0.00001);
	}
	
	
//	@Test
//	public void deveEntenderLanceEmOrdemCrescenteComOutroValores() {
//		// parte 1: cenario
//		Usuario joao = new Usuario("João");
//		Usuario jose = new Usuario("José");
//		Usuario maria = new Usuario("Maria");
//		
//		Leilao leilao = new Leilao("PlaySatation 3 novo");
//		
//		leilao.propoe(new Lance(joao, 1000.0));
//		leilao.propoe(new Lance(jose, 2000.0));
//		leilao.propoe(new Lance(maria, 3000.0));
//		
//		// parte 2: acao
//		Avaliador leiloeiro = new Avaliador();
//		leiloeiro.avalia(leilao);
//		
//		// parte 3: validacao
//		double maiorEsperado = 3000;
//		double menorEsperador = 1000;
//		
//		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
//		
//		Assert.assertEquals(menorEsperador, leiloeiro.getMenorLance(), 0.00001);
//	}
	
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		// parte 1: cenario
		Usuario joao = new Usuario("João");
		Leilao leilao = new Leilao("PlaySatation 3 novo");
		
		leilao.propoe(new Lance(joao, 1000.0));

		// parte 2: acao
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		// parte 3: validacao
		
		assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.00001);
		
		assertEquals(1000.0, leiloeiro.getMenorLance(), 0.00001);
	}
	
	@Test
	public void deveEncontrarOsTresMaiores() {
		// parte 1: cenario
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("PlaySatation 3 novo");
		
		leilao.propoe(new Lance(joao, 100.0));
		leilao.propoe(new Lance(maria, 200.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		
		// parte 2: acao
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		
		// parte 3: validacao
		assertEquals(3, maiores.size());
		assertEquals(400.0, maiores.get(0).getValor(), 0.00001);
		assertEquals(300.0, maiores.get(1).getValor(), 0.00001);
		assertEquals(200.0, maiores.get(2).getValor(), 0.00001);
		
	}

}
