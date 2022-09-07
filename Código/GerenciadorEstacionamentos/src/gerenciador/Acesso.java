package gerenciador;

public abstract class Acesso{
	String placa,
		   dataEHoraEntrada,
		   dataEHoraSaida;
	
	float valorContratante,
		  valorAcesso;
	

	protected Acesso(String placa, String dataEHoraEntrada, String dataEHoraSaida, float valorContratante, float valorAcesso) {
		this.placa = placa;
		this.dataEHoraEntrada = dataEHoraEntrada;
		this.dataEHoraSaida = dataEHoraSaida;
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


	public void setValorContratante(float valorContratante) {
		this.valorContratante = valorContratante;
	}

	public void setValorAcesso(float valorAcesso) {
		this.valorAcesso = valorAcesso;
	}
	
	public String relatorioAcessos() {
		String resposta = "";
		resposta += "Acesso de placa: " + placa + "\n";
		resposta += "Data e hora de entrada: " + dataEHoraEntrada + "\n";
		resposta += "Data e hora de saída: " + dataEHoraSaida + "\n";
		resposta += "Valor: R$ " + valorAcesso + "\n";

		return resposta;
	}

	public String getDataEHoraSaida() {
		return dataEHoraSaida;
	}

	public void setDataEHoraSaida(String dataEHoraSaida) {
		this.dataEHoraSaida = dataEHoraSaida;
	}
	
	//public void determinarTipoAcesso(String placaAcesso, String dataEntradaAcesso, String dataSaidaAcesso, String horaEntradaAcesso, String horaSaidaAcesso, float valorContratanteAcesso, float valorAcessoAcesso, float valorMensalistaAcesso, int ehMensalistaAcesso, int ehEventoAcesso) {
	//	if (ehMensalistaAcesso == 1) {
	//		AcessoMensalista a = new AcessoMensalista(placaAcesso, dataEntradaAcesso, dataSaidaAcesso, horaEntradaAcesso, horaSaidaAcesso, valorContratanteAcesso, valorAcessoAcesso, valorMensalistaAcesso, ehMensalistaAcesso);
	//	}
	//	Gerenciamento.b.cadastrarAcesso(a);
	//	
	//}
	
}
