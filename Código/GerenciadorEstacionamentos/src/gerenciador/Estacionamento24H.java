package gerenciador;

public class Estacionamento24H extends Estacionamento {

	protected Estacionamento24H(String nomeEstacionamento, int id, int capVagas, float valorFrac, float valorHora, float valorDiurna, float valorNoturna, float valorMensalista, int eh24Horas) {
		super(nomeEstacionamento, id, capVagas, valorFrac, valorHora, valorDiurna, valorNoturna, valorMensalista, eh24Horas);
		// TODO Auto-generated constructor stub
	}
	
	public String getNomeEstacionamento24H() {
		return nomeEstacionamento;
	}

}
