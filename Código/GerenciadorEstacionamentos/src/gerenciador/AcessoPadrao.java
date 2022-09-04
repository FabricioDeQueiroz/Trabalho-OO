package gerenciador;

public class AcessoPadrao extends Acesso{
	private float qtdHoras;
	
	protected AcessoPadrao(String placa, String dataEntrada, String dataSaida, String horaEntrada, String horaSaida, float valorContratante, float valorAcesso) {
		super(placa, dataEntrada, dataSaida, horaEntrada, horaSaida, valorContratante, valorAcesso);
	}
	
	public float calcularTempo() {
		
	return qtdHoras;
	}

	@Override
	protected float calculaValorAcesso() {
		// TODO Auto-generated method stub
		return 0;
	}
}
