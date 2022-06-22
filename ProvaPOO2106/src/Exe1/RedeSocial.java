package Exe1;

import javax.swing.*;
import java.util.ArrayList;

public class RedeSocial {
		
	private String dataCriacao;
	private String nomeUsuario;
	private String dataNasc;
	private String senha;
		
	ArrayList<Publicacao> publicacoes = new ArrayList<> ();
	
	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNasc, String senha,
			ArrayList<Publicacao> publicacoes) {
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNasc = dataNasc;
		this.senha = senha;
		this.publicacoes = publicacoes;
	}

	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi); 
	}

	public void imprimePublicacoes() {
		
		}
	

	public void RedeSocial(String dataCriacao, String nomeUsuario, String dataNasc, String senha) {
			
			}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}
	
	
	

	}


