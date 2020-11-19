package br.edu.up.sistema;

import java.util.List;

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
		/*/incluir();
		Pessoa pessoa1 = new Pessoa("Carlos", 25);
		dao.salvar(pessoa1);*/
		
		/*/atualizar();
		Pessoa pessoa = new Pessoa(8, "João", 21);
		dao.atualizar(pessoa);*/
		
		//deletar();
		//pDao.apagar(1);
		
		
		
		
		System.out.println(" ");
		System.out.println("########################################################################################################################################################################################");
		System.out.println(" ");
		
		
		
		
		//listarMedicos()
		System.out.println("---------------------------------------- Lista de Medicos ----------------------------------------");
		
		MedicoDAO medicDao = new MedicoDAO();
		List<Medico> listaMedicos = medicDao.listar();
		for (Medico medico : listaMedicos) {
			System.out.println("ID: " + medico.getId() + 
				"|Nome: " + medico.getNome() + 
				"|Especialidade: " + medico.getEspecialidade()
			);
		}
		
		/*/incluir();
		Pessoa pessoa1 = new Pessoa("Carlos", 25);
		dao.salvar(pessoa1);*/
		
		/*/atualizar();
		Medico medico = new Medico(1, "Dr. RAY", "Politica");
		medicDao.atualizar(medico);*/
		
		/*/deletar();
		dao.apagar(2);*/
		
		
		
		System.out.println(" ");
		System.out.println("########################################################################################################################################################################################");
		System.out.println(" ");
		
		
		
		
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
		
		/*/incluir();
		Pessoa pessoa1 = new Pessoa("Carlos", 25);
		dao.salvar(pessoa1);*/
		
		/*/atualizar();
		Pessoa pessoa = new Pessoa(8, "João", 21);
		dao.atualizar(pessoa);*/
		
		/*/deletar();
		dao.apagar(2);*/
		
		
		System.out.println(" ");
		System.out.println("########################################################################################################################################################################################");
		System.out.println(" ");
		
		
		
		
		//ListarFuncionarios()
		System.out.println("---------------------------------------- Lista de Funcionarios ----------------------------------------");
		
		FuncionarioDAO funcioDao = new FuncionarioDAO();
		List<Funcionario> listaFuncionarios = funcioDao.listar();
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(
				"Id: " + funcionario.getId() + 
				"|Nome: " + funcionario.getNome() + 
				"|Telefone: " + funcionario.getTelefone()*-1 + 
				"|Endereço: " + funcionario.getEndereco() + 
				"|Id do Cargo: " + funcionario.getId_cargo()
			);
		}
		
		/*/incluir();
		Pessoa pessoa1 = new Pessoa("Carlos", 25);
		dao.salvar(pessoa1);*/
		
		/*/atualizar();
		Pessoa pessoa = new Pessoa(8, "João", 21);
		dao.atualizar(pessoa);*/
		
		/*/deletar();
		dao.apagar(2);*/
		
		
		System.out.println(" ");
		System.out.println("########################################################################################################################################################################################");
		System.out.println(" ");
		
		
		
		
		//ListaCargos()
		System.out.println("---------------------------------------- Lista de Cargos ----------------------------------------");
		
		CargoDAO cargoDao = new CargoDAO();
		List<Cargo> listaCargos = cargoDao.listar();
		for (Cargo cargo : listaCargos) {
			System.out.println("Id: " + cargo.getId_cargo() +
				"|Nome do cargo: " + cargo.getNomeCargo()
			);
		}
		/*/incluir();
		Cargo cargo1 = new Cargo(2, "Medico");
		cargoDao.salvar(cargo1);*/
		
		/*/atualizar();
		Pessoa pessoa = new Pessoa(8, "João", 21);
		dao.atualizar(pessoa);*/
		
		/*/deletar();
		dao.apagar(2);*/
	}
}