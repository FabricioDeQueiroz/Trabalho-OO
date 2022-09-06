package gerenciador;

public class AcessoDiaria extends Acesso {
	 // horaInicio e horaFim serão formatados em "DD/MM HH:MM"
		   				
	protected AcessoDiaria(String placa, String dataEHoraEntrada, String dataEHoraSaida, float valorContratante, float valorAcesso, String horaInicio, String horaFim){
		super(placa, dataEHoraEntrada, dataEHoraSaida, valorContratante, valorAcesso);
		
	}

	protected float calculaValorAcesso() {
		// horaInicio, horaFim
		return valorAcesso;
	}
	
	
}
