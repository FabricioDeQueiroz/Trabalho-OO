package controller;

import model.AlunoUnB;

public abstract class AlunoUnBControl {
	
	public static String strRelatorio = null;
	
	public static void enviarAluno(String nome, int matricula, String curso, String email) {
		//intermédio da View para o Model
		
		AlunoUnB b = new AlunoUnB(nome, matricula, curso, email);
		strRelatorio = b.relatorio();
	}
}