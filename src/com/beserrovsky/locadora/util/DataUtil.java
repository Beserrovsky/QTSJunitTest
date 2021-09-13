package com.beserrovsky.locadora.util;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {
	
	
	public Date addDias( Date date, int qtddias) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, qtddias);
		return calendar.getTime();
	}
	
	public Date obterData( int dia, int mes, int ano) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,dia);
		calendar.set(Calendar.MONTH, mes-1);
		calendar.set(Calendar.YEAR, ano);
		return calendar.getTime();
	}
	
	public boolean verificarDatasIguais(Date data1, Date data2){
		return (data1.getTime() == data2.getTime());
	}

}
