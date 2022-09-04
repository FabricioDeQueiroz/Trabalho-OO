package gerenciador;

public class AcessoEvento extends Acesso{
	float valorEvento;
	
	protected AcessoEvento(String placa, String dataEntrada, String dataSaida, String horaEntrada, String horaSaida, float valorContratante, float valorAcesso, float valorEvento) {
		super(placa, dataEntrada, dataSaida, horaEntrada, horaSaida, valorContratante, valorAcesso);
		this.valorEvento = valorEvento;
	}
	
	protected float calculaValorAcesso() {
		valorAcesso = valorEvento;
		return valorAcesso;
	}
}
