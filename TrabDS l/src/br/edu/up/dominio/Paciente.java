package br.edu.up.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "pacientes")
@TableGenerator (

		name = "gerador_de_id",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "pacientes",
		initialValue = 1,
		allocationSize = 1
		)
public class Paciente {
	@Id
	@GeneratedValue (strategy = GenerationType.TABLE, generator = "gerador_de_id")
	@Column (name = "id", nullable=false, unique=true, updatable=false)
	private int id;
	private String nome;
	private int idade;
	private String diagnostico;
	public Paciente() {
		
	}
	
	public Paciente(String nome, int idade, String diagnostico) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.diagnostico = diagnostico;
	}

	public Paciente(int id, String nome, int idade, String diagnostico) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.diagnostico = diagnostico;
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
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

}
