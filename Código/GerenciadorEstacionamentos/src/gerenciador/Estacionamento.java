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
	}

	public boolean cadastrarAcesso(Acesso x) {
		boolean resposta = false;
		resposta = acessos.add(x);
		return resposta;
	}
	
	public Acesso pesquisarAcesso(String placa) {
		String resposta = "";
		for(Acesso a : acessos) {
			if(a.getPlaca().equalsIgnoreCase(placa)) {
				resposta = "Achou" + placa;
				return a;
			}
			else {
				resposta = "Não achou";
			}
		}
		resposta = "Não achou";
		JOptionPane.showMessageDialog(null, resposta + " " + placa);
		return null;
	}
	
	public boolean removerAcesso(Acesso x) {
		boolean resposta = false;
		if(acessos.contains(x)) {
			resposta = acessos.remove(x);
		}
		return resposta;
	}
	
	public String atualizarAcesso(String placa) {
		String resposta;
		for(Acesso a : acessos) {
			if(a.getPlaca().equalsIgnoreCase(placa)) {
				 a.setPlaca(JOptionPane.showInputDialog("Digite a nova placa: "));
				 a.setDataSaida(JOptionPane.showInputDialog("Digite a nova data de saída: "));
				 a.setHoraSaida(JOptionPane.showInputDialog("Digite a nova hora de saída: "));
				 resposta = "Acesso da placa " + placa + " atualizado";
			}
		}
		resposta = "Acesso da placa " + placa + " nÃ£o encontrado";
		return resposta;

	}

	public boolean cadastrarEvento(Evento x){
		boolean resposta = false;
		resposta = eventos.add(x);
		return resposta;
	}

	public Evento pesquisarEvento(String nomeEvento) {
		String resposta = "";
		for(Evento a : eventos) {
			if(a.getNomeEvento().equalsIgnoreCase(nomeEvento)) {
				resposta = "Achou" + nomeEvento;
				return a;
			}
			else {
				resposta = "Não achou";
			}
		}
		resposta = "Não achou";
		JOptionPane.showMessageDialog(null, resposta + " " + nomeEvento);
		return null;
	}

	public String atualizarEvento(String nomeEvento){
		for (Evento x : eventos){
			if (x.getNomeEvento().equalsIgnoreCase(nomeEvento)) {
				x.setNomeEvento(JOptionPane.showInputDialog("Digite o novo nome do evento"));
				x.setDataFim(JOptionPane.showInputDialog("Digite a nova data de finalização do evento"));
				x.setHoraFim(JOptionPane.showInputDialog("Digite a nova hora de finalização do evento"));
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
	
}
