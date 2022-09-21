package controller;

import model.AlunoUnB;

public abstract class AlunoUnBControl {
	
	public static boolean criaAluno(String nome, int matricula, String curso, String email) {
		//Intermédio com Model
		AlunoUnB a = new AlunoUnB(nome, matricula, curso, email);
		a.CadastrarAluno(nome, matricula, curso, email);
		
		return true;
	}
	
	public static boolean removeAluno() {
		//Intermédio com Model
		
	}
	
	public void pesquisaAluno() {
		//Intermédio com Model
	}
	
	public void editaAluno() {
		//Intermédio com Model
	}
	
	public void enviarAluno() {
		//intermédio da View para o Model
	}
	
	public void trazerAluno() {
		//intermédio da View para o Model
	}
}
