package gerenciador;

public class AcessoPadrao extends Acesso{
	private float qtdHoras;
	
	protected AcessoPadrao(String placa, String dataEHoraEntrada, String dataEHoraSaida, float valorContratante, float valorAcesso) {
		super(placa, dataEHoraEntrada, dataEHoraSaida, valorContratante, valorAcesso);
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
