package com.wiliansanello.smartphone;

import com.wiliansanello.fabrica_smartphone.Dispositivo;

public class Iphone {
	
	static Dispositivo dispositivo = new Dispositivo();
	
	public static void main(String[] args) { 
		
		System.out.println("REPRODUÇÃO DE MÚSICA");
		dispositivo.tocar();
		dispositivo.pausar();
		dispositivo.selecionarMusica();
		
		System.out.println("\nTELEFONE CELULAR");
		dispositivo.ligar();
		dispositivo.atender();
		dispositivo.iniciarCorreioDeVoz();
		
		System.out.println("\nNAVEGADOR DE INTERNET");
		dispositivo.exibirPagina();
		dispositivo.adicionarNovaAba();
		dispositivo.atualizarPagina();
	}
}

