package gerenciador;

public class Evento{
	String nomeEvento,
		   dataEHoraInicio,
		   dataEHoraFim;
	float valorEvento;
	
	protected Evento(String nomeEvento, String dataEHoraInicio, String dataEHoraFim, float valorEvento) {
		this.nomeEvento = nomeEvento;
		this.dataEHoraInicio = dataEHoraInicio;
		this.dataEHoraFim = dataEHoraFim;
		this.valorEvento = valorEvento;
	}
	
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	
	public String relatorioEventos() {
		String resposta = "";
		resposta += "Evento: " + nomeEvento + "\n";
		resposta += "Data e hora de início: " + dataEHoraInicio + "\n";
		resposta += "Data e hora do término: " + dataEHoraFim + "\n";

		return resposta;
	}

	public void setDataEHoraFim(String dataEHoraFim) {
		this.dataEHoraFim = dataEHoraFim;
	}
}
