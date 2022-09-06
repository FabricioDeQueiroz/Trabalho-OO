package gerenciador;

public class AcessoEvento extends Acesso{
	float valorEvento;
	
	protected AcessoEvento(String placa, String dataEHoraEntrada, String dataEHoraSaida, float valorContratante, float valorAcesso, float valorEvento) {
		super(placa, dataEHoraEntrada, dataEHoraSaida, valorContratante, valorAcesso);
		this.valorEvento = valorEvento;
	}
	
	protected float calculaValorAcesso() {
		valorAcesso = valorEvento;
		return valorAcesso;
	}

}
