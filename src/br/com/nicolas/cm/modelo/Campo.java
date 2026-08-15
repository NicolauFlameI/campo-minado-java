package br.com.nicolas.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinho = new ArrayList<>();
	
	private int linha;
	private int coluna;
	
	Campo(int linha, int coluna){
		this.linha = linha; 
		this.coluna = coluna;
	}

}
