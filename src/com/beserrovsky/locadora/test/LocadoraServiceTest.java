package com.beserrovsky.locadora.test;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.beserrovsky.locadora.exception.*;
import com.beserrovsky.locadora.models.*;
import com.beserrovsky.locadora.service.LocacaoService;
import com.beserrovsky.locadora.util.DataUtil;

public class LocadoraServiceTest {

	@Test
	public void Teste() throws Exception
	{
		
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("Harry Potter", 15.00, 1);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		
		locacao = locacaoService.alugarJogo(cliente, jogo);
		
		Assert.assertTrue(locacao.getJogo().getNome().equals(jogo.getNome()));
		Assert.assertTrue(locacao.getCliente().getNome().equals(cliente.getNome()));
		Assert.assertTrue("Erro no valor do jogo", locacao.getValor() == jogo.getValor());
		Assert.assertTrue(new DataUtil().verificarDatasIguais(locacao.getRetirada(), new Date()));
	}
	
	@Test ( expected = NoStockException.class )
	public void TesteSemEstoque() throws Exception
	{
		
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("Harry Potter", 15.00, 0);
		
		LocacaoService locacaoService = new LocacaoService();
		locacaoService.alugarJogo(cliente, jogo);
	}
	
	@Test ( expected = NoValueException.class )
	public void TesteValorZero() throws Exception
	{
		
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("Harry Potter", 0, 1);
		
		LocacaoService locacaoService = new LocacaoService();
		locacaoService.alugarJogo(cliente, jogo);
	}
}
