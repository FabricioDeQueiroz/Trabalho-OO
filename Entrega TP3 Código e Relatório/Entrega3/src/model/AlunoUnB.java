package model;

public class AlunoUnB {
	private String nome;
	private int matricula;
	private String curso;
	private String email;
	
	public AlunoUnB() {
		
	}
	
	public AlunoUnB(String nome, int matricula, String curso, String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.email = email;
	}
	
	public String relatorio() {
		String dados = "";
		
		dados += "Nome: " + this.nome + "\n";
		dados += "Matricula: " + this.matricula + "\n";
		dados += "Curso: " + this.curso + "\n";
		dados += "Email: " + this.email;
		
		return dados;
	}
}
