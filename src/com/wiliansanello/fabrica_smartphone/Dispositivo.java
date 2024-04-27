package com.wiliansanello.fabrica_smartphone;

import com.wiliansanello.aparelho_telefonico.AparelhoTelefonico;
import com.wiliansanello.navegador_internet.NavegadorInternet;
import com.wiliansanello.reprodutor_musical.ReprodutorMusical;

public class Dispositivo implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	public void tocar() {
		System.out.println("Tocando música no iPhone");		
	}
	
	public void pausar() {
		System.out.println("Pausando música no iPhone");		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música no iPhone");		
	}

	public void exibirPagina() {
		System.out.println("Exibindo página no Safari");		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no Safari");		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página no Safari");		
	}

	public void ligar() {
		System.out.println("Fazendo ligação no iPhone");		
	}
	
	public void atender() {
		System.out.println("Atendendo ligação no iPhone");
	}

	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz no iPhone");		
	}	

}
