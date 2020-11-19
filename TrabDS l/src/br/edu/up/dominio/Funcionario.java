package br.edu.up.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "funcionarios")
@TableGenerator(
	
	name = "gerador_de_id",
	table = "sqlite_sequence",
	pkColumnName = "name",
	valueColumnName = "seq",
	pkColumnValue = "pacientes",
	initialValue = 1,
	allocationSize = 1

)
public class Funcionario {
	@Id
	@GeneratedValue (strategy = GenerationType.TABLE, generator = "gerador_de_id")
	@Column ( name = "id_funcionario")
	private int id;
	private String nome;
	private int telefone;
	private String endereco;
	private int id_cargo;
	
	public Funcionario() {

	}
	
	public Funcionario(String nome, int telefone, String endereco, int id_cargo) {
		super();
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.id_cargo = id_cargo;
	}
	
	public Funcionario(int id, String nome, int telefone, String endereco, int id_cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.id_cargo = id_cargo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId_cargo() {
		return id_cargo;
	}
	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
	}
	
}
