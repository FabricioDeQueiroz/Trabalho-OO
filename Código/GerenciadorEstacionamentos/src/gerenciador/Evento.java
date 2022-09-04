package gerenciador;

public class Evento{
	String nomeEvento,
		   dataInicio,
		   dataFim,
		   horaInicio,
		   horaFim;
	
	protected Evento(String nomeEvento, String dataInicio, String dataFim, String horaInicio, String horaFim) {
		this.nomeEvento = nomeEvento;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}
	
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
}
