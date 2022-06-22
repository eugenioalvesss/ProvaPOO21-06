package Exe2;

import javax.swing.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ProvaEnem>provas = new ArrayList<ProvaEnem>();
		
		double notaFinal=0;
		int id_aluno = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do aluno: "));
		String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do aluno: "));
		
		AlunoEnem AlunoEnem = new AlunoEnem(id_aluno, nome, ano);	

		for(int i=0; i<=5; i++) {
			int id_Prova = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID da prova: "));
			String titulo = JOptionPane.showInputDialog("Insira o título da prova: ");
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota da prova: "));
			
			ProvaEnem prova = new ProvaEnem (id_Prova, titulo, nota);
			provas.add(prova);
			notaFinal += prova.getNota();
		}
		System.out.println("Nota final do aluno(a) "+nome+" foi " +notaFinal);
	}
}