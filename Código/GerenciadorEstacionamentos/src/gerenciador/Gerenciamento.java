package gerenciador;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Gerenciamento {
	
	//Cria��o das listas
	private static List<Estacionamento> estacionamentos = new LinkedList<Estacionamento>();
	// essa lista tem que estar aqui mesmo? private static List<Evento> eventos = new LinkedList<Evento>();
	
	public static void main(String[] args) {
		
		int loopMenu;
		
		do {
			
			int menu1 = Integer.parseInt(JOptionPane.showInputDialog("1: Gerenciar estacionamentos \n"
																   + "2: Gerenciar acessos \n"
																   + "3: Gerenciar eventos"));
			switch(menu1) {
				case 1: //Gerenciar Estacionamentos
					int menuEstacionamento = Integer.parseInt(JOptionPane.showInputDialog("1: Criar estacionamentos \n"
																					    + "2: Pesquisar estacionamentos \n"
																					    + "3: Editar estacionamentos \n"
																					    + "4: Remover estacionamentos \n"
																						+ "5: Relat�rio estacionamentos"));
					switch(menuEstacionamento) {
						case 1: //Criar Estacionamento
							int cadastrarNovoEstacionamento;
							do {
							String nomeEstacionamento = JOptionPane.showInputDialog("Digite o nome do Estacionamento: ");
							int capVagas = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do Estacionamento: "));
							float valorFrac = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de 15min do Estacionamento: "));
							float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de 1h do Estacionamento: "));
							float valorDiurno = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor diária do Estacionamento: "));
							float valorNoturno = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem extra noturna do Estacionamento: "));
							float valorMensal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade do Estacionamento: "));
							int eh24Horas = JOptionPane.showConfirmDialog(null, "É 24 horas?", "Estacionamentos", JOptionPane.YES_NO_OPTION);
							int id = estacionamentos.size() + 1;
							
							if(eh24Horas == JOptionPane.YES_OPTION) {
							Estacionamento24H a = new Estacionamento24H(nomeEstacionamento, id, capVagas,
							valorFrac, valorHora, valorDiurno, valorNoturno, valorMensal,  eh24Horas);
							estacionamentos.add(a); //Estacionamento 24h cadastrado
							JOptionPane.showMessageDialog(null, "Estacionamento 24h cadastrado");
							}
							if(eh24Horas != JOptionPane.YES_OPTION) {
							String horaAbre = JOptionPane.showInputDialog("Digite a hora que o Estacionamento abre: ");
							String horaFecha = JOptionPane.showInputDialog("Digite a hora que o Estacionamento fecha: ");
							EstacionamentoNormal a = new EstacionamentoNormal(nomeEstacionamento, id, capVagas,
							valorFrac, valorHora, valorDiurno, valorNoturno, valorMensal,  eh24Horas, horaAbre, horaFecha);
							estacionamentos.add(a); //Estacionamento normal cadastrado
							JOptionPane.showMessageDialog(null, "Cadastrado Normal");
							}
							
							//Confirmação para loop de criação de novos estacionamentos
							cadastrarNovoEstacionamento = JOptionPane.showConfirmDialog(null, "Cadastrar outro Estacionamento?", "Estacionamentos", JOptionPane.YES_NO_OPTION);
							} while(cadastrarNovoEstacionamento == JOptionPane.YES_OPTION);
							
							break;
						
						case 2: //Pesquisar Estacionamento
							String nomePesq = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
							pesquisarEstacionamento(nomePesq);
							Estacionamento f = pesquisarEstacionamento(nomePesq);
							
							String relatoEstacionamento = "";
							relatoEstacionamento = f.relatorioEstacionamentos();
							JOptionPane.showMessageDialog(null, relatoEstacionamento);
							
							break;
							
							case 3: //Atualizar Estacionamento
							String nomeAtt = JOptionPane.showInputDialog("Informe o nome do estacionamento que deseja atualizar: ");
							JOptionPane.showMessageDialog(null, atualizarEstacionamento(nomeAtt));
							
							break;
						
						case 4: //Deletar Estacionamento
							String nomeDel = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
							Estacionamento x = pesquisarEstacionamento(nomeDel);
							JOptionPane.showMessageDialog(null, removerEstacionamento(x));
							
							break;
						
						case 5: //Relat�rio Estacionamentos
							String relatoEstacionamentosGeral = "";
							for (int i = 0; i < estacionamentos.size(); i++) {
								
								relatoEstacionamentosGeral += estacionamentos.get(i).relatorioEstacionamentos() + "\n";
							}
							JOptionPane.showMessageDialog(null, relatoEstacionamentosGeral);
							
							break;
							
						default:
						
							break;
					}
					break;
			
				case 2: //Gerenciar Acessos
					int menuAcessos = Integer.parseInt(JOptionPane.showInputDialog("1: Criar acessos \n"
																			     + "2: Pesquisar acessos \n"
																			     + "3: Editar acessos \n"
																			     + "4: Remover acessos"));
					switch(menuAcessos) {
						case 1: //Criar Acesso
							int cadastrarNovoAcesso;
							do {
								String estacionamentoAddAcesso = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
								Estacionamento b = pesquisarEstacionamento(estacionamentoAddAcesso);
								String placa = JOptionPane.showInputDialog("Digite a placa do veículo: ");
								String dataEntrada = JOptionPane.showInputDialog("Digite a data de entrada do veículo: ");
								String dataSaida = JOptionPane.showInputDialog("Digite a data de saida do veículo: ");
								String horaEntrada = JOptionPane.showInputDialog("Digite a hora de entrada do veículo: ");
								String horaSaida = JOptionPane.showInputDialog("Digite a hora de saida do veículo: ");
								float valorContratante = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do contratante: "));
								float valorAcesso = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de acesso: "));
								
								AcessoPadrao x = new AcessoPadrao(placa, dataEntrada, dataSaida, horaEntrada, horaSaida, valorContratante, valorAcesso);
								b.cadastrarAcesso(x);
								
								cadastrarNovoAcesso = JOptionPane.showConfirmDialog(null, "Cadastrar outro Acesso?", estacionamentoAddAcesso, JOptionPane.YES_NO_OPTION);
							} while(cadastrarNovoAcesso == JOptionPane.YES_OPTION);
							
							break;
						
						case 2: //Pesquisar Acesso
							String estacionamentoPesqAcesso = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
							Estacionamento c = pesquisarEstacionamento(estacionamentoPesqAcesso);
							String placaPesq = JOptionPane.showInputDialog("Informe a placa do acesso: ");
							JOptionPane.showMessageDialog(null, c.pesquisarAcesso(placaPesq));
							
							break;
						
						case 3: //Atualizar Acesso
							String estacionamentoAttAcesso = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
							Estacionamento d = pesquisarEstacionamento(estacionamentoAttAcesso);
							String placaAtt = JOptionPane.showInputDialog("Informe a placa do acesso: ");
							JOptionPane.showMessageDialog(null, d.atualizarAcesso(placaAtt));
							
							break;
						
						case 4: //Deletar Acesso
							String estacionamentoDelAcesso = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
							Estacionamento e = pesquisarEstacionamento(estacionamentoDelAcesso);
							String placaDel = JOptionPane.showInputDialog("Informe a placa do acesso: ");
							Acesso x = e.pesquisarAcesso(placaDel);
							JOptionPane.showMessageDialog(null, e.removerAcesso(x));
							
							break;
					}
					break;
				
				case 3: //Gerenciar Eventos
					int menuEventos = Integer.parseInt(JOptionPane.showInputDialog("1: Criar eventos \n"
																			     + "2: Pesquisar eventos \n"
																			     + "3: Editar eventos \n"
																			     + "4: Remover eventos"));
					switch(menuEventos) {
						case 1: //Criar Evento
							int cadastrarNovoEvento;
							do {
							
								String estacionamentoAddEvento = JOptionPane.showInputDialog("Informe o nome do estacionamento: ");
								Estacionamento b = pesquisarEstacionamento(estacionamentoAddEvento);
								String nomeEvento = JOptionPane.showInputDialog("Digite o nome do evento: ");
								String dataInicio = JOptionPane.showInputDialog("Digite a data de início do evento: ");
								String dataFim = JOptionPane.showInputDialog("Digite a data de finalização do evento: ");
								String horaInicio = JOptionPane.showInputDialog("Digite a hora de início do evento: ");
								String horaFim = JOptionPane.showInputDialog("Digite a hora de finalização do evento: ");
								Evento x = new Evento(nomeEvento, dataInicio, dataFim, horaInicio, horaFim);
								b.cadastrarEvento(x);
								cadastrarNovoEvento = JOptionPane.showConfirmDialog(null, "Cadastrar outro evento?", estacionamentoAddEvento, JOptionPane.YES_NO_OPTION);
							
							} while(cadastrarNovoEvento == JOptionPane.YES_OPTION);
							
							break;
						
						case 2: //Pesquisar Evento
							String estacionamentoPesqEvento = JOptionPane.showInputDialog("Digite o nome do estacionamento");
							Estacionamento c = pesquisarEstacionamento(estacionamentoPesqEvento);
							String eventoPesq = JOptionPane.showInputDialog("Informe o nome do evento");
							JOptionPane.showMessageDialog(null, c.pesquisarEvento(eventoPesq)); 
						
							break;
						
						case 3: //Atualizar Evento
							String estacionamentoAttEvento = JOptionPane.showInputDialog("Informe o nome do estacionamento");
							Estacionamento d = pesquisarEstacionamento(estacionamentoAttEvento);
							String eventoAtt = JOptionPane.showInputDialog("Informe o nome do evento");
							JOptionPane.showMessageDialog(null, d.atualizarEvento(eventoAtt));
							
							break;
						
						case 4: //Deletar Evento
							String estacionamentoDelEvento = JOptionPane.showInputDialog("Informe o nome do estacionamento");
							Estacionamento e = pesquisarEstacionamento(estacionamentoDelEvento);
							String eventoDel = JOptionPane.showInputDialog("Informe o nome do evento");
							JOptionPane.showMessageDialog(null, e.deletarEvento(eventoDel));
							
							break;
				}
				
				break;
			}
			
			loopMenu = JOptionPane.showConfirmDialog(null, "Voltar ao menu principal?", "Gerenciamento", JOptionPane.YES_NO_OPTION);
		} while(loopMenu == JOptionPane.YES_OPTION);
		
		
		
		
		//String relatoAcessos = "";
		//for (int i = 0; i < Estacionamento.acessos.size(); i++) {
		//	
		//	relatoAcessos += Estacionamento.acessos.get(i).relatorioAcessos() + "\n";
		//}
		//JOptionPane.showMessageDialog(null, relatoAcessos);
		
		//Teste de visibilidade de cadastro
		//JOptionPane.showMessageDialog(null, estacionamentos.get(1).getCapVagas());
	}
	
	//private static void definirAcesso(String horaEntrada, String horaSaida) {
	//	
	//}

	public static boolean removerEstacionamento(Estacionamento x) {
		boolean resposta = false;
		if(estacionamentos.contains(x)) {
			resposta = estacionamentos.remove(x);
		}
		return resposta;
	}
	
	public static Estacionamento pesquisarEstacionamento(String nome) {
		String resposta = "";
		for(Estacionamento a : estacionamentos) {
			if(a.getNomeEstacionamento().equalsIgnoreCase(nome)) {
				resposta = "Achou" + nome;
				return a;
			}
			else {
				resposta = "N�o achou";
			}
		}
		resposta = "N�o achou";
		JOptionPane.showMessageDialog(null, resposta + " " + nome);
		return null;
	}
	
	public static boolean atualizarEstacionamento(String nome) {
		boolean resposta = false;
		for(Estacionamento a : estacionamentos) {
			if(a.getNomeEstacionamento().equalsIgnoreCase(nome)) {
				 a.setNomeEstacionamento(JOptionPane.showInputDialog("Digite o novo nome do Estacionamento: "));
				 a.setCapVagas(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova capacidade do Estacionamento: ")));
				 a.setValorFrac(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor de 15min do Estacionamento: ")));
			     a.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor de 1h do Estacionamento: ")));
			     a.setValorDiurna(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor da di�ria do Estacionamento: ")));
			     a.setValorNoturna(Float.parseFloat(JOptionPane.showInputDialog("Digite a nova porcentagem extra noturna do Estacionamento: ")));
			     a.setValorMensalista(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor da mensalidade do Estacionamento: ")));
			     resposta = true;
			}
		}
		return resposta;
	}

}
