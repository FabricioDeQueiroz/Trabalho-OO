package gerenciador;

public class AcessoMensalista extends Acesso {
	float valorMensalista;
	
	protected AcessoMensalista(String placa, String dataEHoraEntrada, String dataEHoraSaida, float valorContratante, float valorAcesso, float valorMensalista) {
		super(placa, dataEHoraEntrada, dataEHoraSaida, valorContratante, valorAcesso);
		this.valorMensalista = valorMensalista;
	}

	protected float calculaValorAcesso() {
		valorAcesso = valorMensalista;
		return valorAcesso;
	}
}
