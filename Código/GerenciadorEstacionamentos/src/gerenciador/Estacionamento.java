package gerenciador;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Estacionamento {
	String nomeEstacionamento;
	int id,
		capVagas;
	float valorFrac,
	      valorHora,
	      valorDiurna,
	      valorNoturna,
		  valorMensalista;
	
	int eh24Horas;
	
	private List<Acesso> acessos;
	
	private List<Evento> eventos;
	
	protected Estacionamento(String nomeEstacionamento, int id, int capVagas, float valorFrac, float valorHora, float valorDiurna, float valorNoturna, float valorMensalista, int eh24Horas) {
		this.nomeEstacionamento = nomeEstacionamento;
		this.id = id;
		this.capVagas = capVagas;
		this.valorFrac = valorFrac;
		this.valorHora = valorHora;
		this.valorDiurna = valorDiurna;
		this.valorNoturna = valorNoturna;
		this.valorMensalista = valorMensalista;
		this.eh24Horas = eh24Horas;
		this.acessos = new LinkedList<Acesso>();
		this.eventos = new LinkedList<Evento>();
	}

	public boolean cadastrarAcesso(Acesso x) {
		boolean resposta = false;
		resposta = getAcessos().add(x);
		return resposta;
	}
	public int getTamanhoAcessos() {
		return acessos.size();
	}
	
	public Acesso pesquisarAcesso(String placa) {
		String resposta = "";
		for(Acesso a : getAcessos()) {
			if(a.getPlaca().equalsIgnoreCase(placa)) {
				resposta = placa + " encontrada";
				return a;
			}
			else {
				resposta = "Placa não encontrada";
			}
		}
		resposta = "Placa não encontrada";
		JOptionPane.showMessageDialog(null, resposta + " " + placa);
		return null;
	}
	
	public boolean removerAcesso(Acesso x) {
		boolean resposta = false;
		if(getAcessos().contains(x)) {
			resposta = getAcessos().remove(x);
		}
		return resposta;
	}
	
	public String atualizarAcesso(String placa) {
		String resposta;
		for(Acesso a : getAcessos()) {
			if(a.getPlaca().equalsIgnoreCase(placa)) {
				 a.setDataEHoraSaida(JOptionPane.showInputDialog("Digite a nova data e hora de saída: "));
				 resposta = "Acesso da placa " + placa + " atualizado";
			}
		}
		resposta = "Acesso da placa " + placa + " não encontrado";
		return resposta;

	}

	public boolean cadastrarEvento(Evento x){
		boolean resposta = false;
		resposta = getEventos().add(x);
		return resposta;
	}

	public Evento pesquisarEvento(String nomeEvento) {
		String resposta = "";
		for(Evento a : eventos) {
			if(a.getNomeEvento().equalsIgnoreCase(nomeEvento)) {
				resposta = nomeEvento + "encontrado";
				return a;
			}
			else {
				resposta = "Evento";
			}
		}
		resposta = "Evento";
		JOptionPane.showMessageDialog(null, resposta + " " + nomeEvento + "não encontrado");
		return null;
	}

	public String atualizarEvento(String nomeEvento){
		for (Evento x : eventos){
			if (x.getNomeEvento().equalsIgnoreCase(nomeEvento)) {
				x.setNomeEvento(JOptionPane.showInputDialog("Digite o novo nome do evento: "));
				x.setDataEHoraFim(JOptionPane.showInputDialog("Digite a nova data de finalização do evento: "));
				return "Evento atualizado com sucesso";
			}
		}
		return "Evento não encontrado";
	}
	
	public String deletarEvento(String nomeEvento){
		for (Evento x : eventos){
			if (x.getNomeEvento().equalsIgnoreCase(nomeEvento)){
				eventos.remove(x);
				return "Evento deletado";
			}
		}
		return "Evento não encontrado";
	}
	
	public String relatorioEstacionamentos() {
		String eh24 = "";
		
		if(eh24Horas == 0) {
			eh24 = "Sim";
		}
		else {
			eh24 = "Não";
		}
		
		String resposta = "";
		resposta += "Estacionamento: " + id + " " + nomeEstacionamento + "\n";
		resposta += "Capacidade: " + capVagas + "\n";
		resposta += "24 horas? " + eh24 + "\n";

		return resposta;
	}

	public void setNomeEstacionamento(String nomeEstacionamento) {
		this.nomeEstacionamento = nomeEstacionamento;
	}

	public void setCapVagas(int capVagas) {
		this.capVagas = capVagas;
	}

	public void setValorFrac(float valorFrac) {
		this.valorFrac = valorFrac;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public void setValorDiurna(float valorDiurna) {
		this.valorDiurna = valorDiurna;
	}

	public void setValorNoturna(float valorNoturna) {
		this.valorNoturna = valorNoturna;
	}

	public void setValorMensalista(float valorMensalista) {
		this.valorMensalista = valorMensalista;
	}

	public void setEh24Horas(int eh24Horas) {
		this.eh24Horas = eh24Horas;
	}

	
	
	public String getNomeEstacionamento() {
		return nomeEstacionamento;
	}
	
	public int getId() {
		return id;
	}
	
	public int getCapVagas() {
		return capVagas;
	}
	
	public float getValorMensalista() {
		return valorMensalista;
	}

	public List<Acesso> getAcessos() {
		return acessos;
	}

	public List<Evento> getEventos() {
		return eventos;
	}
	
}
