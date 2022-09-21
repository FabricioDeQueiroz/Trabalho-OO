package model;

import java.util.ArrayList;
import java.util.List;

public class AlunoUnB {
	private String nome;
	private int matricula;
	private String curso;
	private String email;
	
	private List<AlunoUnB> alunos = new ArrayList<AlunoUnB>();
	
	public AlunoUnB() {
		
	}
	
	public AlunoUnB(String nome, int matricula, String curso, String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean CadastrarAluno(String nome, int matricula, String curso, String email) {
		boolean resposta = false;
		
		AlunoUnB a = new AlunoUnB(nome, matricula, curso, email);
		resposta = alunos.add(a);
		
		return resposta;
	}
	
	public AlunoUnB PesquisarAluno(int matricula) {
		for(AlunoUnB a : alunos) {
			if(a.getMatricula() == matricula) {
				return a;
			}
			else {
				throw new RuntimeException("Aluno não encontrado");
			}
		}
		return null;
	}
	
	public boolean RemoverAluno(AlunoUnB x) {
		boolean resposta = false;
		
		if(alunos.contains(x)) {
			resposta = alunos.remove(x);
		}
		else {
			throw new RuntimeException("Erro ao remover aluno");
		}
		return resposta;
	}
	
	public boolean EditarAluno(AlunoUnB x) {
		boolean resposta = false;
		
		if(alunos.contains(x)) {
			x.setNome(nome);
			x.setMatricula(matricula);
			x.setCurso(curso);
			x.setEmail(email);
			
			resposta = true;
		}
		else {
			throw new RuntimeException("Erro ao editar aluno");
		}
		return resposta;
	}

}
