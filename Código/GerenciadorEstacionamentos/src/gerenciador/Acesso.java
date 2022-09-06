package gerenciador;

public abstract class Acesso{
	String placa,
		   dataEntrada,
		   dataSaida,
		   horaEntrada,
		   horaSaida;
	
	float valorContratante,
		  valorAcesso;

	protected Acesso(String placa, String dataEntrada, String dataSaida, String horaEntrada, String horaSaida, float valorContratante, float valorAcesso) {
		this.placa = placa;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.valorContratante = valorContratante;
		this.valorAcesso = valorAcesso;
	}
	
	//protected float calculaValorAcesso();

	protected float calculaValorAcesso() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public void setValorContratante(float valorContratante) {
		this.valorContratante = valorContratante;
	}

	public void setValorAcesso(float valorAcesso) {
		this.valorAcesso = valorAcesso;
	}
	
	
	
}
