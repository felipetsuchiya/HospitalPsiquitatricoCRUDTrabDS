package br.edu.up.sistema;

import java.util.List;
import java.util.Scanner;

import br.edu.up.dao.CargoDAO;
import br.edu.up.dao.FuncionarioDAO;
import br.edu.up.dao.MedicoDAO;
import br.edu.up.dao.PacienteDAO;
import br.edu.up.dao.TratamentoDAO;
import br.edu.up.dominio.Cargo;
import br.edu.up.dominio.Funcionario;
import br.edu.up.dominio.Medico;
import br.edu.up.dominio.Paciente;
import br.edu.up.dominio.Tratamento;

public class Programa {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		
		boolean desejaRealizarOperação = true;
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("[1] Pacientes");
			System.out.println("[2] Medicos");
			System.out.println("[3] Tratamentos");
			System.out.println("[4] Funcionarios");
			System.out.println("[5] Cargos");
			System.out.println("[0] Cancelar");
			
			int op = leitor.nextInt();
			leitor.nextLine();
			switch (op) {
				case 1:	
					boolean desejaAlterarPaciente = true;
					do {
						//listar()
						System.out.println("---------------------------------------- Lista de pacientes ----------------------------------------");
						
						PacienteDAO pDao = new PacienteDAO();
						List<Paciente> lista = pDao.listar();
						for (Paciente p : lista) {
							System.out.println("ID: " + p.getId() +
									"|Nome: " + p.getNome() + 
									"|Idade: " + p.getIdade() + 
									"|Diagnostico: " + p.getDiagnostico()
									);
						}
						System.out.println("---------------------------------------- Lista de pacientes ----------------------------------------");
						System.out.println("Escolha uma opção");
						System.out.println("[1] Incluir um paciente");
						System.out.println("[2] Atualizar um paciente");
						System.out.println("[3] Deletar um paciente");
						System.out.println("[0] Cancelar");
						
						int opPacientes = leitor.nextInt();
						leitor.nextLine();
						
						switch (opPacientes) {
							case 1:
								System.out.println("Digite o nome do paciente: ");
								String nomePaci = leitor.nextLine();
								System.out.println("Digite a idade do paciente: ");
								int idadePaci = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Digite o diagnóstico do pacinete: ");
								String diagPaci = leitor.nextLine();
								//incluir();
								Paciente paciente1 = new Paciente(nomePaci, idadePaci, diagPaci);
								pDao.salvar(paciente1);
								break;
							case 2:
								System.out.println("Digite o ID do paciente que deseja atualizar: ");
								int idPaciente = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Atualize o nome do paciente: ");
								String attNomePaci = leitor.nextLine();
								System.out.println("Atualize a idade do paciente: ");
								int attIdadePaci = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Atualize o diagnostico do paciente: ");
								String attDiagPaci = leitor.nextLine();
								//atualizar();
								Paciente paciente = new Paciente(idPaciente, attNomePaci, attIdadePaci, attDiagPaci);
								pDao.atualizar(paciente);
								break;
							case 3:
								//deletar();
								System.out.println("Escolha o ID do paciente que deseja apagar: ");
								int idPacienteDel = leitor.nextInt();
								pDao.apagar(idPacienteDel);	
								break;
							case 0:
								desejaAlterarPaciente = false;
								break;
						}
					} while (desejaAlterarPaciente);
						break;
				case 2:
					boolean desejaAlterarMedicos = true;
					do {
						//listarMedicos()
						System.out.println("---------------------------------------- Lista de Medicos ----------------------------------------");
						
						MedicoDAO medicDao = new MedicoDAO();
						List<Medico> listaMedicos = medicDao.listar();
						for (Medico medico : listaMedicos) {
							System.out.println("ID: " + medico.getId() + 
									"|Nome: Dr." + medico.getNome() + 
									"|Especialidade: " + medico.getEspecialidade()
									);
						}
						System.out.println("Escolha uma opção");
						System.out.println("[1] Incluir um medico");
						System.out.println("[2] Atualizar um medico");
						System.out.println("[3] Deletar um medico");
						System.out.println("[0] Cancelar");
						
						int opMedicos = leitor.nextInt();
						leitor.nextLine();
						
						switch (opMedicos) {
							case 1:
								//incluir();
								System.out.println("Digite o nome do medico: ");
								String nomeMedi = leitor.nextLine();
								System.out.println("Digite a especialidade do medico: ");
								String especiMedi = leitor.nextLine();
								Medico medico1 = new Medico(nomeMedi, especiMedi);
								medicDao.salvar(medico1);
								break;
							case 2:
								//atualizar();
								System.out.println("Digite o ID do medico que será atualizado: ");
								int idMedico = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Atualize o nome do medico: ");
								String attNomeMedi = leitor.nextLine();
								System.out.println("Atualize a especialidade do medico: ");
								String attEspeciMedi = leitor.nextLine();
								
								Medico medico = new Medico(idMedico, attNomeMedi, attEspeciMedi);
								medicDao.atualizar(medico);
								break;
							case 3:
								//deletar();
								System.out.println("Escolha o ID do paciente que deseja apagar: ");
								int idMedicoDel = leitor.nextInt();
								medicDao.apagar(idMedicoDel);	
								break;
							case 0:
								desejaAlterarMedicos = false;
								break;	
						}
					} while (desejaAlterarMedicos);
						break;
				case 3: 
					boolean desejaAlterarTratamento = true;
					do {
						//ListarTratamentos()
						System.out.println("---------------------------------------- Lista de Tratamentos ----------------------------------------");
						
						TratamentoDAO tratDao = new TratamentoDAO();
						List<Tratamento> listaTratamentos = tratDao.listar();
						for (Tratamento tratamento : listaTratamentos) {
							System.out.println("ID: " + tratamento.getId() + 
									"|Nome: " + tratamento.getNome() + 
									"|Medico responsável: " + tratamento.getId_medico()
									);
						}
						System.out.println("Escolha uma opção");
						System.out.println("[1] Incluir um tratamento");
						System.out.println("[2] Atualizar um tratamento");
						System.out.println("[3] Deletar um tratamento");
						System.out.println("[0] Cancelar");
						
						int opTrat = leitor.nextInt();
						leitor.nextLine();
						
						switch (opTrat) {
							case 1:
								//incluir();
								System.out.println("Digite o nome do tratamento: ");
								String nomeTrat = leitor.nextLine();
								System.out.println("Digite o ID do medico que ira realizar o tratamento: ");
								int idMediTrat = leitor.nextInt();
								Tratamento trat1 = new Tratamento(nomeTrat, idMediTrat);
								tratDao.salvar(trat1);
								break;
							case 2:
								//atualizar();
								System.out.println("Digite o ID do tratamento que será atualizado: ");
								int idTrat = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Atualize o nome do tratamento: ");
								String attTratNome = leitor.nextLine();
								System.out.println("Atualize o ID do medico que ira realizar o tratamento: ");
								int attidMediTrat = leitor.nextInt();
								leitor.nextLine();
								
								Tratamento tratamento = new Tratamento(idTrat, attTratNome, attidMediTrat);
								tratDao.atualizar(tratamento);
								break;
							case 3:
								//deletar();
								System.out.println("Escolha o ID do tratamento que deseja apagar: ");
								int idTratDel = leitor.nextInt();
								tratDao.apagar(idTratDel);	
								break;
							case 0:
								desejaAlterarTratamento = false;	
								break;	
						}
					} while (desejaAlterarTratamento);
						break;
				case 4:
					boolean desejaAlterarFuncionario = true;
					do {
						//ListarFuncionarios()
						System.out.println("---------------------------------------- Lista de Funcionarios ----------------------------------------");
						
						FuncionarioDAO funcioDao = new FuncionarioDAO();
						List<Funcionario> listaFuncionarios = funcioDao.listar();
						for (Funcionario funcionario : listaFuncionarios) {
							System.out.println(
									"Id: " + funcionario.getId() + 
									"|Nome: " + funcionario.getNome() + 
									"|Telefone: " + funcionario.getTelefone() + 
									"|Endereço: " + funcionario.getEndereco() + 
									"|Id do Cargo: " + funcionario.getId_cargo()
									);
						}
						System.out.println(" ");
						System.out.println("Escolha uma opção");
						System.out.println("[1] Incluir um funcionario");
						System.out.println("[2] Atualizar um funcionario");
						System.out.println("[3] Deletar um funcionario");
						System.out.println("[0] Cancelar");
						
						int opFuncio = leitor.nextInt();
						leitor.nextLine();
						
						switch (opFuncio) {
							case 1:
								//incluir();
								System.out.println("Digite o nome do funcionario: ");
								String nomeFuncio = leitor.nextLine();
								System.out.println("Digite o telefone do funcionario: ");
								int teleFuncio = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Digite o endereço do funcioario");
								String endeFuncio = leitor.nextLine();
								System.out.println("Digite o ID do Cargo do funcionario: ");
								int idCargoFuncio = leitor.nextInt();
								leitor.nextLine();
								
								Funcionario trat1 = new Funcionario(nomeFuncio, teleFuncio, endeFuncio, idCargoFuncio);
								funcioDao.salvar(trat1);
								break;
							case 2:
								//atualizar();
								System.out.println("Digite o ID do funcionario: ");
								int idFuncio = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Digite o nome do funcionario: ");
								String attNomeFuncio = leitor.nextLine();
								System.out.println("Digite o telefone do funcionario: ");
								int attTeleFuncio = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Digite o endereço do funcioario");
								String attEndeFuncio = leitor.nextLine();
								System.out.println("Digite o ID do Cargo do funcionario: ");
								int attIdCargoFuncio = leitor.nextInt();
								leitor.nextLine();
								
								Funcionario tratamento = new Funcionario(idFuncio, attNomeFuncio, attTeleFuncio, attEndeFuncio, attIdCargoFuncio);
								funcioDao.atualizar(tratamento);
								break;
							case 3:
								//deletar();
								System.out.println("Escolha o ID do funcionario que deseja apagar: ");
								int idFuncioDel = leitor.nextInt();
								funcioDao.apagar(idFuncioDel);	
								break;
							case 0:
								desejaAlterarFuncionario = false;	
								break;	
							}
					} while (desejaAlterarFuncionario);
					break;
				case 5:
					boolean desejaAlterarCargo = true;
					do {
						//ListaCargos()
						System.out.println("---------------------------------------- Lista de Cargos ----------------------------------------");
						
						CargoDAO cargoDao = new CargoDAO();
						List<Cargo> listaCargos = cargoDao.listar();
						for (Cargo cargo : listaCargos) {
							System.out.println("Id: " + cargo.getId_cargo() +
									"|Nome do cargo: " + cargo.getNomeCargo()
									);
						}
						System.out.println("Escolha uma opção");
						System.out.println("[1] Incluir um cargo");
						System.out.println("[2] Atualizar um cargo");
						System.out.println("[3] Deletar um cargo");
						System.out.println("[0] Cancelar");
						
						int opCargo = leitor.nextInt();
						leitor.nextLine();
						
						switch (opCargo) {
							case 1:
								//incluir();
								System.out.println("Digite o nome do cargo: ");
								String nomeCargo = leitor.nextLine();
								
								Cargo cargo1 = new Cargo(nomeCargo);
								cargoDao.salvar(cargo1);
								break;
							case 2:
								//atualizar();
								System.out.println("Digite o ID do cargo que será atualizado: ");
								int idCargo = leitor.nextInt();
								leitor.nextLine();
								System.out.println("Atualize o nome do cargo: ");
								String attNomeCargo = leitor.nextLine();
								
								Cargo cargo = new Cargo(idCargo, attNomeCargo);
								cargoDao.atualizar(cargo);
								break;
							case 3:
								//deletar();
								System.out.println("Escolha o ID do funcionario que deseja apagar: ");
								int idCargoDel = leitor.nextInt();
								cargoDao.apagar(idCargoDel);	
								break;
							case 0:
								desejaAlterarCargo = false;	
							break;	
						}
					} while (desejaAlterarCargo);
						break;
				case 0: 
					desejaRealizarOperação = false;
					break;
			}		
		} while (desejaRealizarOperação);
		System.out.println("Fim da operação!!!! Fim da operação!!!! Fim da operação!!!! Fim da operação!!!!");
		leitor.close();
	}
}