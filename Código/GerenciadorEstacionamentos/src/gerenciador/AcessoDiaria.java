package gerenciador;

public class AcessoDiaria extends Acesso {
	
	String horaInicio, // horaInicio e horaFim serão formatados em "DD/MM HH:MM"
	       horaFim;
		   				
	protected AcessoDiaria(String placa, String dataEntrada, String dataSaida, String horaEntrada, String horaSaida, float valorContratante, float valorAcesso, String horaInicio, String horaFim){
		super(placa, dataEntrada, dataSaida, horaEntrada, horaSaida, valorContratante, valorAcesso);
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		
	}

	protected float calculaValorAcesso() {
		// horaInicio, horaFim
		return valorAcesso;
	}
	
	
}
