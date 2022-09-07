package gerenciador;

public class AcessoDiaria extends Acesso {
	 // horaInicio e horaFim serão formatados em "DD/MM HH:MM"
		   				
	protected AcessoDiaria(String placa, String dataEHoraEntrada, String dataEHoraSaida, float valorContratante, float valorAcesso){
		super(placa, dataEHoraEntrada, dataEHoraSaida, valorContratante, valorAcesso);
		
	}
	
}
