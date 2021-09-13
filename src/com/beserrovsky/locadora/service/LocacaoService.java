package com.beserrovsky.locadora.service;
import java.util.Date;

import com.beserrovsky.locadora.util.DataUtil;
import com.beserrovsky.locadora.models.*;
import com.beserrovsky.locadora.exception.*;


public class LocacaoService {
	
	private final int diasPadrao = 5;
	public int testePublic;
	int testeDefault;
	
	public Locacao alugarJogo(Cliente cliente, Jogo jogo) throws Exception
	{
		
		if(jogo.getQtdEstoque() == 0) throw new NoStockException();
		
		Locacao locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setJogo(jogo);
		locacao.setValor(jogo.getValor());
		locacao.setRetirada(new Date());
		
		Date devolucao = new DataUtil().addDias(new Date(), diasPadrao);
		locacao.setDevolucao(devolucao);
		return locacao;
	}
}
