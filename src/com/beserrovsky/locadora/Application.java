package com.beserrovsky.locadora;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("App running!");
		new Application();		
	}
	
	public Application() {
		
		try {
			meuMetodo();
		}
		catch(FileNotFoundException e) { System.out.println("Arquivo não encontrado!"); } 
		catch(IOException e) { System.out.println("I/O Erro ocorreu!"); }
	}
	
	public void meuMetodo() throws FileNotFoundException, IOException{
		InputStream is = new FileInputStream("meuArq.txt");
		is.close();
	}
}
