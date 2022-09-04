package gerenciador;

public class AcessoMensalista extends Acesso {
	float valorMensalista;
	
	protected AcessoMensalista(String placa, String dataEntrada, String dataSaida, String horaEntrada, String horaSaida, float valorContratante, float valorAcesso, float valorMensalista) {
		super(placa, dataEntrada, dataSaida, horaEntrada, horaSaida, valorContratante, valorAcesso);
		this.valorMensalista = valorMensalista;
	}

	protected float calculaValorAcesso() {
		valorAcesso = valorMensalista;
		return valorAcesso;
	}
}
