package gerenciador;

public class EstacionamentoNormal extends Estacionamento {
	String horaAbre,
		   horaFecha;

	protected EstacionamentoNormal(String nomeEstacionamento, int id, int capVagas, float valorFrac, float valorHora, float valorDiurna, float valorNoturna, float valorMensalista, int eh24Horas, String horaAbre, String horaFecha) {
		super(nomeEstacionamento, id, capVagas, valorFrac, valorHora, valorDiurna, valorNoturna, valorMensalista, eh24Horas);
		this.horaAbre = horaAbre;
		this.horaFecha = horaFecha;
	}

	public String getHoraAbre() {
		return horaAbre;
	}

	public String getHoraFecha() {
		return horaFecha;
	}	
}
